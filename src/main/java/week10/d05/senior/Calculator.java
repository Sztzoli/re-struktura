package week10.d05.senior;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public int[] getData() {
        System.out.println("tömb hossza");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            System.out.println("szám");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    public int findMinSum(int[] arr) {
        return Arrays.stream(arr).sorted().limit(4).sum();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] array = calculator.getData();
        System.out.println(calculator.findMinSum(array));
    }
}
