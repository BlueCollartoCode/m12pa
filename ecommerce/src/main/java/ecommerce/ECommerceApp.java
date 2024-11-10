// ECommerceApp.java
// D. Singletary
// 11/10/24
// Use strategy pattern to implement a simple ECommerce application

package ecommerce;

import cart.ShoppingCart;
import cart.RegularPricingStrategy;
import cart.DiscountPricingStrategy;
import cart.BulkDiscountPricingStrategy;

public class ECommerceApp {
    public static void main(String[] args) {

        // standard discount percentage
        final double STANDARD_DISCOUNT = 0.1;  // 10%

        // bulk discount
        final int BULK_MINIMUM_QTY = 5;
        final double BULK_DISCOUNT = 0.2;  // 20%

        // Regular Pricing
        ShoppingCart regularCart =
                new ShoppingCart(new RegularPricingStrategy());

        // Discount Pricing (10% discount)
        ShoppingCart discountCart =
                new ShoppingCart(new DiscountPricingStrategy(STANDARD_DISCOUNT));

        // Bulk Discount Pricing
        ShoppingCart bulkDiscountCart =
                new ShoppingCart(
                        new BulkDiscountPricingStrategy(BULK_MINIMUM_QTY,
                                                        BULK_DISCOUNT));

        // Create at least 5 products
        // Product product1 = new Product("Laptop", 999.99);

        // Add all five products to each cart
        // regularCart.addProduct(product1);
        // discountCart.addProduct(product1);
        // bulkDiscountCart.addProduct(product1);

        // Display each cart to test the different pricing strategies
        System.out.println("Regular Pricing Strategy:");
        regularCart.displayCart();

        System.out.println("\nDiscount Pricing Strategy:");
        discountCart.displayCart();

        System.out.println("\nBulk Discount Pricing Strategy:");
        bulkDiscountCart.displayCart();
    }
}
