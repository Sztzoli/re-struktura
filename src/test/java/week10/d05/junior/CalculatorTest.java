package week10.d05.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(16, new Calculator().findMinSum(array));
    }

}