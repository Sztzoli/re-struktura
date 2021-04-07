package week11.d02.junior;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return new ArrayList<>(rides);
    }

    public boolean addRide(Ride ride) {
        if (rides.isEmpty()) {
            if (ride.getStop()==1) {
                rides.add(ride);
                return true;
            }
            else {
                throw new IllegalArgumentException("Invalid ride");
            }
        }
        Ride lastRide = rides.get(rides.size()-1);
        if (ride.getDay()==lastRide.getDay() && ride.getStop()==lastRide.getStop()+1) {
            rides.add(ride);
            return true;
        }
        else if (ride.getDay()>lastRide.getDay() && ride.getStop()==1) {
            rides.add(ride);
            return true;
        }
        else {
            throw new IllegalArgumentException("Invalid ride");
        }
    }

    public int getDayOff() {
        List<Integer> days = rides.stream().map(Ride::getDay).distinct().collect(Collectors.toList());
        for (int i = 1; i <= 7; i++) {
            if (!days.contains(i)) {
                return i;
            }
        }
        throw new IllegalArgumentException("dolgozott minden nap");
    }
}
