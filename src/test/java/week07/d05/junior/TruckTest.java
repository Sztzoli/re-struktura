package week07.d05.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void create() {
        Vehicle truck = new Truck();
        assertEquals(5, truck.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, truck.getTransmissionType());
    }

}