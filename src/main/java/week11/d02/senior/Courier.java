package week11.d02.senior;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Courier {

    private Map<Integer, List<Ride>> rideMap = new HashMap<>();

    public Map<Integer, List<Ride>> getRideMap() {
        return rideMap;
    }

    public void readFromFile(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<Ride> rides =
                    reader.lines()
                            .map(Ride::lineToRide)
                            .collect(Collectors.toList());
            for (Ride ride : rides) {
                int key = ride.getDay();
                if (rideMap.containsKey(key)) {
                    List<Ride> list = new ArrayList<>(rideMap.get(key));
                    list.add(ride);
                    rideMap.put(key, list);
                } else {
                    rideMap.put(key, Collections.singletonList(ride));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot read", ioe);
        }

    }

    public void readFromFile2(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<Ride> rides =
                    reader.lines()
                            .map(Ride::lineToRide)
                            .collect(Collectors.toList());
            rideMap = rides.stream().collect(Collectors.groupingBy(Ride::getDay));

        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot read", ioe);
        }

    }

    public Ride firstRide() {
        return rideMap.values()
                .stream().flatMap(Collection::stream)
                .min(Comparator.comparingInt(Ride::getDay).thenComparingInt(Ride::getStop))
                .orElseThrow(()-> new IllegalStateException("Not found"));
    }

    public Map<Integer, Integer> stats() {
        return rideMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().stream().mapToInt(Ride::getDistance).sum()));
    }


}
