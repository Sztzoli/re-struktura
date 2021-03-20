package week07.d04.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    void testFileRead() {
        ShoppingList shoppingList = new ShoppingList();
        long x = shoppingList.calculateSum("src/main/resources/week07/d04/senior/test.txt");
        assertEquals(400, x);
    }

}