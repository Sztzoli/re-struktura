package week10.d01.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {


    @Test
    void getPlusElevation() {
        Hiking hiking = new Hiking();
        List<Integer> numbers = List.of(10, 20, 15, 18);
        assertEquals(13, hiking.getPlusElevation(numbers));
    }
}