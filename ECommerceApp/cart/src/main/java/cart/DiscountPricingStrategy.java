// Justin Cope
// COP3330C Module 12 Programming Assignment
// DiscountPricingStrategy.java

package cart;

import product.Product;

import java.util.List;

public class DiscountPricingStrategy implements PricingStrategy {
    private final double discountRate;

    public DiscountPricingStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotal(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        return total - (total * discountRate);
    }
}