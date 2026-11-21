// Justin Cope
// COP3330C Module 12 Programming Assignment
// PricingStrategy.java

package cart;

import product.Product;
import java.util.List;

public interface PricingStrategy {
    double calculateTotal(List<Product> products);
}