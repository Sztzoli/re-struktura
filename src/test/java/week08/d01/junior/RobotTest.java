package week08.d01.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void testMove() {
        Robot robot = new Robot();
        assertEquals("LLLJJJ", robot.move(" FFLLLLLBBBBJJJJJJJ"));
    }
}