package week08.d03.senior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortest() {
        StringLists stringLists = new StringLists();
        List<String> test = List.of("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(List.of("aa", "bb", "dd"), stringLists.shortestWords(test));
    }

}