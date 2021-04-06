package week10.d05.junior;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {
        return Arrays.stream(arr).sorted().limit(4).sum();
    }

}
