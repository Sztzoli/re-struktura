package week10.d01.senior;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class HikingFileTest {


    @Test
    void elevation() {
        String text = """
                47.497913, 19.040236, 400
                47.497912, 19.040232, 420
                47.497916, 19.040236, 410""";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        HikingFile hikingFile = new HikingFile();
        assertEquals(20, hikingFile.getPlusElevation(inputStream));
    }

}