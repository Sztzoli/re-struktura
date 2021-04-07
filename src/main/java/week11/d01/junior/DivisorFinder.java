package week11.d01.junior;

public class DivisorFinder {

    public int findDivisors(int n) {
        String[] parts = String.valueOf(n).split("");
        int counter = 0;
        for (String text : parts) {
            if (n % Integer.parseInt(text)==0) {
                counter++;
            }
        }
        return counter;
    }
}
