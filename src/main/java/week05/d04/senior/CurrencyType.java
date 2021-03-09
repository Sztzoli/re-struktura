package week05.d04.senior;

public enum CurrencyType {
    HUF(1D),
    USD(1 / 300D);

    private double exchange;

    CurrencyType(double exchange) {
        this.exchange = exchange;
    }

    public static double convert(Product product, CurrencyType type) {
        return product.getPrice() * type.exchange / product.getCurrency().exchange;
    }
}
