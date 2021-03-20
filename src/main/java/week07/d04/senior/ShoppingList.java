package week07.d04.senior;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ShoppingList {

    public long calculateSum(String path) {
        Path file = Path.of(path);

        try (Stream<String> line = Files.lines(file)){
            return line
                    .map(Item::of)
                    .mapToInt(Item::sum)
                    .sum();
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read");
        }

    }

}
