// BulkDiscountPricingStrategy.java
// D. Singletary
// 11/10/24
// Bulk discount pricing strategy class for ECommerce application

package cart;

import product.Product;

import java.util.List;

public class BulkDiscountPricingStrategy implements PricingStrategy {
    private final int minItems;
    private final double discountRate;

    public BulkDiscountPricingStrategy(int minItems, double discountRate) {
        this.minItems = minItems;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotal(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        if (products.size() >= minItems) {
            total -= total * discountRate;
        }
        return total;
    }
}
