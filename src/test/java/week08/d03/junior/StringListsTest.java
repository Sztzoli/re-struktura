package week08.d03.junior;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testCreate() {
        StringLists stringLists = new StringLists();
        List<String> fist= List.of("a","b","asd");
        List<String> second= List.of("a","c","asd");
        Set<String> result = stringLists.stringListsUnion(fist,second);
        assertEquals("[a, b, asd, c]", result.toString());
    }

}