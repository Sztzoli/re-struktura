package week05.d04.junior;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getNumberOfExpired() {
        LocalDate now = LocalDate.now();
        return (int) products.stream()
                .filter(x -> x.getExpirationDate().isBefore(now))
                .count();
    }
}
