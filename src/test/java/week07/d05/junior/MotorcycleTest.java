package week07.d05.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void create() {
        Vehicle motor = new Motorcycle();
        assertEquals(5, motor.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, motor.getTransmissionType());
    }

}