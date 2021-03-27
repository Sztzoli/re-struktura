package week08.d02.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CountryStatistics {

    private List<County> counties = new ArrayList<>();

    public List<County> getCounties() {
        return new ArrayList<>(counties);
    }

    public void addFromFile() {

        try (BufferedReader reader =
                     new BufferedReader
                             (new InputStreamReader
                                     (CountryStatistics.class.getResourceAsStream("countries.txt")))) {
            reader.lines()
                    .map(County::new)
                    .forEach(x -> counties.add(x));
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read file", ioException);
        }
    }

    public County maxPopulation() {
        return counties.stream()
                .max(Comparator.comparingInt(County::getPopulation))
                .orElseThrow(IllegalArgumentException::new);
    }
}
