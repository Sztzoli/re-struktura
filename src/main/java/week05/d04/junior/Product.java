package week05.d04.junior;

import java.time.LocalDate;

public class Product {

    /*
    Készíts egy Product osztályt melyben egy termékről tárolod a nevét és a lejárati dátumát (LocalDate)!
    Legyen egy konstruktora, ami a nevet kapja meg illetve a lejárati dátumot három részletben int year, int month,
    int day (public Product(String name, int year, int month, int day))!
    A lejárati dátumot a konstruktorban állítsd össze! Legyen mindkettőhöz getter metódus! Készíts egy Store osztályt,
     melyben van egy Product-okat tároló lista. Legyen benne egy addProduct(Product) metódus!

Bónusz: Legyen benne egy getNumberOfExpired() metódus ami visszaadja a lejárt termékek számát! Használd a LocalDate.now() és az isBefore() metódusokat!
     */

    private String name;
    private LocalDate expirationDate;

    public Product(String name, int year, int month, int days) {
        this.name = name;
        this.expirationDate = LocalDate.of(year, month, days);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
