package week08.d04.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class ExamplesStore {

    public List<String> getTitlesOfExamples() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(ExamplesStore.class.getResourceAsStream("examples.md"))))
         {
             return reader.lines()
                     .filter(x -> x.contains("#"))
                     .map(x -> x.substring(2))
                     .collect(Collectors.toList());

        } catch (IOException ioException) {
            throw new IllegalStateException("File cannot read", ioException);
        }
    }

}
