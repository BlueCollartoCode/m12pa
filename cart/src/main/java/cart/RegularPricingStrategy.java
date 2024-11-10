// RegularPricingStrategy.java
// D. Singletary
// 11/10/24
// Regular pricing strategy class for ECommerce application

package cart;

import product.Product;

import java.util.List;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
