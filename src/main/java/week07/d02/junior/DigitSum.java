package week07.d02.junior;

public class DigitSum {

    public static int sumOfDigits(int x) {
        String number = Integer.toString(x);
        return number.chars()
                .map(i -> i - '0')
                .sum();
    }
}
