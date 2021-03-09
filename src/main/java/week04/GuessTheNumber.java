package week04;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    /*
    Írj egy számkitaláló programot a GuessTheNumber osztályba!
     A program kitalál egy véletlenszerű számot 1 és 100 között.
      Majd bekér a felhasználótól ciklusban számokat. Mindig megmondja, hogy a szám, kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.

Bónusz feladat: max 6-szor lehet kérdezni!
     */

    public void guesser() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);
        boolean isSameNumber = false;
        int counterOfRounds = 0;
        while (!isSameNumber && counterOfRounds < 6) {
            counterOfRounds++;
            System.out.println("Adj meg egy számot");
            int guessNumber = Integer.parseInt(scanner.nextLine());
            if (guessNumber < randomNumber) {
                System.out.println("nagyobb a keresett szám");
            } else if (guessNumber > randomNumber) {
                System.out.println("kisebb a keresett szám");
            } else {
                isSameNumber = true;
            }
        }
        if (isSameNumber) {
            System.out.println("nyertél");
        } else {
            System.out.println("veszítettél");
        }
    }

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guesser();
    }
}
