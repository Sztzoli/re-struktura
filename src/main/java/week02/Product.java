package week02;

public class Product {

    /*
    Írj egy Product oszályt String name és String code attribútumokkal!
     Legyen egy konstruktora a két attribútummal!
     Legyen egy areTheyEqual() metódusa, mely kap egy másik Product példányt,
     és eldönti, hogy azonos-e az adott példánnyal. Két termék akkor egyezik, ha a nevük megegyezik.

Bónusz: szigorúbb egyelőség a feltételre: a két termék kódjának hosszának különbsége maximum egy karakter lehet.
     */
    private final String name;
    private final String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product otherProduct) {
        int difference = Math.abs(this.code.length() - otherProduct.code.length());
        return  (this.name!=null && this.name.equals(otherProduct.name) && difference<=1);
    }

}
