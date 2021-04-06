package week10.d02.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void countMaxMap() {
        MaxTravel travel = new MaxTravel();
        assertEquals(4, travel.getMaxIndexMap(List.of(12,12,0,3,4,4)));
    }

    @Test
    void countMax() {
        MaxTravel travel = new MaxTravel();
        assertEquals(4, travel.getMaxIndex(List.of(12,12,0,3,4,4,4)));
    }
}