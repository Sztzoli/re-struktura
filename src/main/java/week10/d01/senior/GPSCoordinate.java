package week10.d01.senior;

public class GPSCoordinate {

    private double lang;
    private double lon;
    private int elevation;

    public GPSCoordinate(double lang, double lon, int elevation) {
        this.lang = lang;
        this.lon = lon;
        this.elevation = elevation;
    }

    public static GPSCoordinate convertFromFile(String line) {
        String[] parts = line.split(",");
        return new GPSCoordinate(Double.parseDouble(parts[0].trim()), Double.parseDouble(parts[1].trim()), Integer.parseInt(parts[2].trim()));
    }

    public double getLang() {
        return lang;
    }

    public double getLon() {
        return lon;
    }

    public int getElevation() {
        return elevation;
    }
}
