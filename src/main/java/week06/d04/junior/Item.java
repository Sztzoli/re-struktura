package week06.d04.junior;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
