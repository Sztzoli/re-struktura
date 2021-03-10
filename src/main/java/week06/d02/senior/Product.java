package week06.d02.senior;

public class Product {
    /*
    Hozz létre egy Product osztályt melynek adattagjai a név, kategória és ár.
     A kategória legyen enum FROZEN, DAIRY, BAKEDGOODS, OTHER felsorolókkal. Készíts egy Store osztályt benne egy Product listával,
     amit konstruktorban kap meg. Legyen egy getProductsByCategory() aminek az lényége,
     hogy visszaadja valamilyen adatszerkezetben, hogy melyik kategóriából hány darab van a listában.
    A "valamilyen adatszerkezet" a kreativításodra van bízva, az a lényeg, hogy valahogy egyben kapjam meg, hogy melyik kategóriából hány darab van.

     */

    private final String name;
    private final ProductType type;
    private final int price;

    public Product(String name, ProductType type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
