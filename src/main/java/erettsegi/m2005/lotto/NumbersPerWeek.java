package erettsegi.m2005.lotto;

import java.util.Arrays;

public class NumbersPerWeek {
    int[] number = new int[5];

    public NumbersPerWeek(String line) {
        String[] parts = line.split(" ");
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(parts[i]);
        }
    }

    public NumbersPerWeek(int[] number) {
        this.number = number;
    }

    public void sortByAsc() {
        Arrays.sort(number);
    }

    public int numberOfOdd() {
        return (int) Arrays.stream(number)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public String toNiceString() {
        return String.format("%d %d %d %d %d", number[0], number[1], number[2], number[3], number[4]);
    }

    @Override
    public String toString() {
        return Arrays.toString(number);
    }
}
