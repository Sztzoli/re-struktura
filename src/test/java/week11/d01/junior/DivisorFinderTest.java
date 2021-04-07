package week11.d01.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void test() {
        assertEquals(1, new DivisorFinder().findDivisors(425));
    }
}