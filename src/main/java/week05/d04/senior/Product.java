package week05.d04.senior;

import java.time.LocalDate;

public class Product {
    /*
    Készíts egy osztályt Product néven, melynek van egy price (long) és egy currency (String) mezője.
    A Product a konstruktorában ellenőrizze a currency mezőt,
     melynek az értéke vagy HUF, vagy USD lehet. Készíts egy metódust convertPrice() néven,
      melynek egy paramétere van (currency) és visszaadja a currency-nek megfelelő összeget (double).
       Használjunk 300 forintos átváltási árfolyamot! Példa: ha a Product-ot létrehozzuk a következőképp: new Product(150, "HUF"),
        majd meghívjuk a convertPrice-ot USD paraméterrel, akkor az elvárt visszatérési érték 0.5.

Bónusz feladat: Használj enum-ot String helyett a pénznem reprezentációjára!

     */
    private long price;
    private CurrencyType currency;

    public Product(long price, CurrencyType currency) {
        this.price = price;
        this.currency = currency;
    }

    public long getPrice() {
        return price;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public double convertPrice(CurrencyType type) {
        return CurrencyType.convert(this, type);
    }

    public static void main(String[] args) {
        Product product = new Product(100, CurrencyType.USD);
        System.out.println(product.convertPrice(CurrencyType.USD));
    }
}
