package week06.d02.junior;

public class Product {

    /*
    Hozz létre egy Product osztályt melynek adattagjai a név, kategória és ár,
     rendre String, String int! Készíts egy Store osztályt benne egy Product listával,
      amit konstruktorban kap meg. Legyen egy getProductByCategoryName(Category), ami visszaadja,
     hogy a paraméterül kapott kategóriából hány darab van a listában! Bónusz: A kategória legyen enum FROZEN, DAIRY, BAKEDGOODS, OTHER felsorolókkal!
     */

    private String name;
    private ProductType type;
    private int price;

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
