package week10.d02.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Travel {

    public int getStopWithMax(InputStream inputStream) {
        List<Integer> stops = getStops(inputStream);
        return getMaxIndex(stops);
    }

    private List<Integer> getStops(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            return reader
                    .lines()
                    .map(l -> l.split(" ")[0])
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot read", ioe);
        }
    }

    private int getMaxIndex(List<Integer> numbers) {
        int actualNumber = numbers.get(0);
        int maxNumber = numbers.get(0);
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == actualNumber) {
                counter++;
                if (i == numbers.size() - 1 && maxCounter < counter) {
                    maxCounter = counter;
                    maxNumber = actualNumber;
                }
            } else {
                if (maxCounter < counter) {
                    maxCounter = counter;
                    maxNumber = actualNumber;
                }
                actualNumber = numbers.get(i);
                counter = 1;
            }
        }
        return maxNumber;
    }
}
