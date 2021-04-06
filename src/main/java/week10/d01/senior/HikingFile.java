package week10.d01.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class HikingFile {

    public int getPlusElevation(InputStream inputStream) {
        List<GPSCoordinate> coordinates = listFromFile(inputStream);
       List<Integer> elevation = coordinates.stream().map(GPSCoordinate::getElevation).collect(Collectors.toList());
       return elevation(elevation);
    }

    private List<GPSCoordinate> listFromFile(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            return reader.lines()
                    .map(GPSCoordinate::convertFromFile)
                    .collect(Collectors.toList());
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot read", ioe);
        }
    }

    private int elevation(List<Integer> numbers) {
        int result = 0;
        int actualNumber = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (actualNumber<numbers.get(i)) {
                result += (numbers.get(i)-actualNumber);
            }
            actualNumber = numbers.get(i);
        }
        return result;
    }
}
