
// Justin Cope
// COP3330C Module 12 Programming Assignment
// ShoppingCart.java

package cart;

import product.Product;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private PricingStrategy pricingStrategy;

    public ShoppingCart(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return pricingStrategy.calculateTotal(products);
    }

    public void displayCart() {
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}