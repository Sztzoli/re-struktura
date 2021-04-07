package week11.d03.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
            void est() {
        CharCounter charCounter = new CharCounter();
        String[] array = {"abc", "cba", "ab"};
        assertEquals(2,charCounter.countChars(array));
    }

}