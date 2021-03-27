package week08.d03.junior;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringLists {

    Set<String> stringListsUnion(List<String> first, List<String> second) {
        Set<String> result = new HashSet<>();
        result.addAll(first);
        result.addAll(second);
        return result;
    }
}
