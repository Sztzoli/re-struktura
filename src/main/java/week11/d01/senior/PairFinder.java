package week11.d01.senior;

import java.util.ArrayList;
import java.util.List;

public class PairFinder {

    public int findPairs(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        int counter = 0;
        for (int number : arr) {
            if (numbers.contains(number)) {
                counter++;
                numbers.remove(Integer.valueOf(number));
            } else {
                numbers.add(number);
            }

        }
        return counter;
    }
}
