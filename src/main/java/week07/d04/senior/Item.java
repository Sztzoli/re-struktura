package week07.d04.senior;

public class Item {
    private final String name;
    private final int amount;
    private final int price;

    private Item(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public static Item of(String line) {
        String[] parts = line.split(";");
        return new Item(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    }

    public int sum() {
        return amount * price;
    }
}
