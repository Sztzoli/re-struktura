package week07.d01.senior;

public class Fibonacci {

    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Counter can't be less then 0");
        }

        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (RESULT[n] == null) {
            RESULT[n] = fib(n - 1) + fib(n - 2);
        }

        return RESULT[n];


    }

    private static final Long[] RESULT = new Long[1000];
}
