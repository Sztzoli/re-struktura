package week02;

import java.util.Scanner;

public class InputNames {
    /*
    Hozz létre egy InputNames Java osztályt,
     melynek van egy main metódusa. Ciklusban kérj be öt nevet!
      A neveket tárold el egy tömbben! Írd ki a tömb tartalmát, sortöréssel elválasztva (írd bele, hogy hanyadik elem - 1-től sorszámozva)!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namesArray = new String[5];
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println("Adj meg az " + (i+1)+". nevet");
            namesArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(i+1+". név: "+namesArray[i]);
        }
    }
}
