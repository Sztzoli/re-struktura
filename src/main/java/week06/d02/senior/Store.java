package week06.d02.senior;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Store {
    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public Map<ProductType, Long> getProductsByCategory() {
        return products.stream()
                .map(Product::getType)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
