// Justin Cope
// COP3330C Module 12 Programming Assignment
// RegularPricingStrategy.java

package cart;

import product.Product;

import java.util.List;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}