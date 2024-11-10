// PricingStrategy.java
// D. Singletary
// 11/10/24
// Pricing strategy interface for ECommerce application

package cart;

import product.Product;
import java.util.List;

public interface PricingStrategy {
    double calculateTotal(List<Product> products);
}
