package week11.d02.senior;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void testMap() {
        String text = """
                1 1 12 
                1 2 11 
                2 1 10 
                4 1 19""";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        Courier courier = new Courier();
        courier.readFromFile(inputStream);
        System.out.println(courier.getRideMap());
    }

    @Test
    void testMap2() {
        String text = """
                1 1 12 
                1 2 11 
                2 1 10 
                4 1 19""";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        Courier courier = new Courier();
        courier.readFromFile2(inputStream);
        System.out.println(courier.getRideMap());
    }

    @Test
    void testFirst() {
        String text = """
                1 1 12 
                1 2 11 
                2 1 10 
                4 1 19""";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        Courier courier = new Courier();
        courier.readFromFile2(inputStream);
        System.out.println(courier.firstRide());
        System.out.println(courier.stats());
    }

}