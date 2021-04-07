package week11.d04.senior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameLengthTest {

    @Test
    void getLengths() {
        List<String> names = List.of("Joe", "Jack", "Jane", "Jake", "George", "William");
        NameLength nameLength = new NameLength();
        assertEquals(List.of(3,4), nameLength.getLengths(names));
    }
}