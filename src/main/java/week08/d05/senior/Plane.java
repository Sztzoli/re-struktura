package week08.d05.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plane {

    public int fly() {
        int maxLength = 0;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(Plane.class.getResourceAsStream("map.txt")))){
            int size;
            int actualLength = 0;
            while ((size = reader.read()) > 0) {

                switch (size) {
                    case 48:
                        actualLength++;
                        break;
                    case 49:
                        if (maxLength < actualLength) {
                            maxLength = actualLength;
                        }
                        actualLength=0;
                        break;
                }

            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new Plane().fly());
    }
}
