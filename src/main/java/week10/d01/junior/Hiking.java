package week10.d01.junior;

import java.util.List;

public class Hiking {

    public int getPlusElevation(List<Integer> numbers) {
        int result = 0;
        int actualNumber = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (actualNumber<numbers.get(i)) {
                result += (numbers.get(i)-actualNumber);
            }
            actualNumber = numbers.get(i);
        }
        return result;
    }
}
