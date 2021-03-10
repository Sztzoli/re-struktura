package week06.d04.junior;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Budget {

    /*
    Készíts az egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
    Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name.
    A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items listát. Írj egy metódust,
    getItemsByMonth néven, mely egy hónapot vár (1-12) és visszaadja az Item-eket az adott hónapban! Bónusz feladat: ellenőrizzük a bemeneti paramétereket!
     */

    List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public List<Item> getItemsByMonth(int month) {
        checkMonth(month);
        return items.stream()
                .filter(item -> item.getMonth()==month)
                .collect(Collectors.toList());
    }

    private void checkMonth(int month) {
        if (month>12 || month<1) {
            throw new IllegalArgumentException();
        }
    }
}
