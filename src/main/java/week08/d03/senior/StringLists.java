package week08.d03.senior;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (result.isEmpty() || word.length() == result.get(0).length()) {
                result.add(word);
            } else if (word.length() < result.get(0).length()) {
                result.clear();
                result.add(word);
            }
        }
        return result;
    }
}
