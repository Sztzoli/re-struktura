package week08.d05.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void test() {
        MathAlgorithms algorithms = new MathAlgorithms();
        assertEquals(4,algorithms.greatestCommonDivisor(12,8));
    }

}