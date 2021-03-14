package erettsegi.m2005.lotto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.IllegalSelectorException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Lotto {

    public static int[] PRIME = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89};
    public static int[] LOTTO_NUMBERS = new int[90];

    Scanner scanner = new Scanner(System.in);
    DataFormUser dataFormUser = new DataFormUser();
    private List<NumbersPerWeek> lottoList = new ArrayList<>();
    private NumbersPerWeek week52;

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Lotto.class.getResourceAsStream("lottosz.dat")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                NumbersPerWeek numbersPerWeek = new NumbersPerWeek(line);
                lottoList.add(numbersPerWeek);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot red file");
        }
    }


    public void getLottoNumbersFromUser() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = dataFormUser.getData(() -> Integer.parseInt(scanner.nextLine()), "adjon meg 52 heti lotto " + (i + 1) + ". számát");
        }
        week52 = new NumbersPerWeek(numbers);
    }

    public void orderByAsc() {
        week52.sortByAsc();
    }

    public int getNumberFromUser() {
        return dataFormUser.getData(() -> Integer.parseInt(scanner.nextLine()), "Adjon meg egy számot 1 és 51 között");
    }

    public List<NumbersPerWeek> getLottoList() {
        return lottoList;
    }

    public NumbersPerWeek getWeek52() {
        return week52;
    }

    public int countAllOdd() {
        return (int) lottoList.stream()
                .mapToInt(NumbersPerWeek::numberOfOdd)
                .count();
    }

    public void isEveryNumber() {
        if (lottoNumberPull()) {
            System.out.println("Nincs");
        } else {
            System.out.println("Van");
        }
    }

    public boolean lottoNumberPull() {
        fillUpWithNumbers();
        for (int number : LOTTO_NUMBERS) {
            if (number == 0) {
                return false;
            }
        }
        return true;
    }

    private void fillUpWithNumbers() {
        for (NumbersPerWeek numbers : lottoList) {
            for (int lottoNumber : numbers.number) {
                if (LOTTO_NUMBERS[lottoNumber - 1] == 0) {
                    LOTTO_NUMBERS[lottoNumber - 1] = 1;
                }
            }
        }
    }

    public void writer() {
        Path path = Path.of("src/main/resources/erettsegi/m2005/lotto/lotto52.ki");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (NumbersPerWeek numbers : lottoList) {
                writer.write(numbers.toNiceString());
                writer.write("\n");
            }
            writer.write(week52.toNiceString());
            writer.write("\n");
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    public Map<Integer, Integer> mapFromFile() {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 90; i++) {
            result.put(i, 0);
        }
        Path path = Path.of("src/main/resources/erettsegi/m2005/lotto/lotto52.ki");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    result.merge(Integer.parseInt(parts[i]), 1, Integer::sum);
                }
            }
            return result;
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file");
        }
    }

    public void countOfNumber(Map<Integer, Integer> map) {
        for (int number : map.values()) {
            System.out.print(number + " ");
        }
    }

    public List<Integer> primeWhichNotPull(Collection<Integer> collection) {
        List<Integer> values = new ArrayList<>(collection);
        List<Integer> result= new ArrayList<>();
        for (int prime :PRIME) {
            if (values.get((prime-1))==0){
                result.add(prime);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.readFromFile();
        lotto.getLottoNumbersFromUser();
        lotto.orderByAsc();
        System.out.println("52. hét számai");
        System.out.println(lotto.getWeek52());
        int number = lotto.getNumberFromUser();
        System.out.println(number + ". hét számai");
        System.out.println(lotto.getLottoList().get(number - 1));
        System.out.println("Minden szám szerepelt?");
        lotto.isEveryNumber();
        System.out.println("páratlan számok");
        System.out.println(lotto.countAllOdd());
        lotto.writer();
        Map<Integer, Integer> map = lotto.mapFromFile();
        System.out.println(map);
        lotto.countOfNumber(map);
        System.out.println("primek melyek nincsenek kihúzva");
        System.out.println(lotto.primeWhichNotPull(map.values()));

    }

}
