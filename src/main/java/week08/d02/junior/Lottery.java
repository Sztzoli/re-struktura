package week08.d02.junior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> starterNumber = new ArrayList<>();

    public Lottery() {
        for (int i = 1; i < 90; i++) {
            starterNumber.add(i);
        }
    }

    public List<Integer> getNumbers() {
        List<Integer> shuffleList = new ArrayList<>(starterNumber);
        Collections.shuffle(shuffleList);
        return shuffleList.subList(0,5);
    }
}
