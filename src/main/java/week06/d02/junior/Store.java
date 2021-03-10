package week06.d02.junior;


import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int getProductByCategoryName(ProductType type) {
        return (int) products.stream()
                .filter(product -> product.getType() == type)
                .count();
    }
}
