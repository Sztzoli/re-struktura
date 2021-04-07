package week11.d01.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    void test() {
        PairFinder pairFinder = new PairFinder();
        int[] array = {7, 1, 5, 7, 3, 3, 5, 7, 6, 7};
        assertEquals(4, pairFinder.findPairs(array));
    }

}