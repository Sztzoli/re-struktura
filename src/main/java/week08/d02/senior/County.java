package week08.d02.senior;

public class County {
    private final String name;
    private final int population;
    private final int colorNumberOfFlag;
    private final int borderCounty;

    public County(String line) {
        String[] parts = line.split(" ");
        this.name = parts[0];
        this.population = Integer.parseInt(parts[1]);
        this.colorNumberOfFlag = Integer.parseInt(parts[2]);
        this.borderCounty = Integer.parseInt(parts[3]);
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getColorNumberOfFlag() {
        return colorNumberOfFlag;
    }

    public int getBorderCounty() {
        return borderCounty;
    }

    @Override
    public String toString() {
        return "County{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", colorNumberOfFlag=" + colorNumberOfFlag +
                ", borderCounty=" + borderCounty +
                '}';
    }
}
