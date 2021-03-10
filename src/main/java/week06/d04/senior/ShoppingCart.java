package week06.d04.senior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    /*
    A ShoppingCart osztályba dolgozz! Legyen egy addItem(String name, int quantity) metódusa,
     mellyel új bevásárlólista tételt lehet felvenni (termék neve és mennyisége).
      Az adatokat egy Item listába tárolja. Amennyiben már benne van az adott termék, ne újonnan vegye fel,
       hanem adja hozzá a mennyiséget a már felvett tételhez!
    Lehessen visszakérdezni név alapján a felvett mennyiséget a getItem(String name): int metódussal. Ha nem szerepel benne, 0 értéket adjon vissza!
     */

    Map<String, Integer> items = new HashMap<>();

    public Map<String, Integer> getItems() {
        return items;
    }

    public void addItem(String name, int quantity) {
        items.merge(name, quantity, Integer::sum);
    }

    public int getItem(String name) {
        return items.get(name);
    }

}
