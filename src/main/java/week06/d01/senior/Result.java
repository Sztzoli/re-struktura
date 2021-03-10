package week06.d01.senior;

public class Result {
    private double positivePart;
    private double negativePart;


    public void addString(String number) {
        number = number.replace(',','.');
        double value = Double.parseDouble(number);
        add(value);
    }

    private void add(double value) {
        if (value <0) {
              negativePart += value;
        } else {
            positivePart += value;
        }
    }


    public double getPositivePart() {
        return positivePart;
    }

    public double getNegativePart() {
        return negativePart;
    }


}
