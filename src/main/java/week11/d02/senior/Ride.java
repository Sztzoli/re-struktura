package week11.d02.senior;

public class Ride {

    private int day;
    private int stop;
    private int distance;

    public Ride(int day, int stop, int distance) {
        this.day = day;
        this.stop = stop;
        this.distance = distance;
    }

    public static Ride lineToRide(String line) {
        String[] parts = line.split(" ");
        return new Ride(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    }

    public int getDay() {
        return day;
    }

    public int getStop() {
        return stop;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "day=" + day +
                ", stop=" + stop +
                ", distance=" + distance +
                '}';
    }
}
