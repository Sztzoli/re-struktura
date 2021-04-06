package week10.d02.senior;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void maxStops() {
        Travel travel = new Travel();
        String text = """
                0 20190326-0700 6572582 RVS 20210101
                0 20190326-0700 8808290 JGY 7
                0 20190326-0700 1680423 TAB 20190420
                12 20190326-0716 3134404 FEB 20190301
                12 20190326-0716 9529716 JGY 0""";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        assertEquals(0, travel.getStopWithMax(inputStream));
    }

}