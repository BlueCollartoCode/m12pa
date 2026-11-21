// Justin Cope
// COP3330C Module 12 Programming Assignment
// ECommerceApp.java

package ecommerce;

import product.Product;
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
                new ShoppingCart(new BulkDiscountPricingStrategy(BULK_MINIMUM_QTY, BULK_DISCOUNT));

        // Create at least 5 products
        // Product product1 = new Product("Laptop", 999.99);
        Product product1 = new Product("Golf Clubs", 899.99);
        Product product2 = new Product("Golf Balls", 59.99);
        Product product3 = new Product("Golf Tees", 9.99);
        Product product4 = new Product("Golf Mat", 69.99);
        Product product5 = new Product("Golf Shoes", 99.99);
        // Add all five products to each cart
        // regularCart.addProduct(product1);
        // discountCart.addProduct(product1);
        // bulkDiscountCart.addProduct(product1);
        regularCart.addProduct(product1);
        discountCart.addProduct(product1);
        bulkDiscountCart.addProduct(product1);
        regularCart.addProduct(product2);
        discountCart.addProduct(product2);
        bulkDiscountCart.addProduct(product2);
        regularCart.addProduct(product3);
        discountCart.addProduct(product3);
        bulkDiscountCart.addProduct(product3);
        regularCart.addProduct(product4);
        discountCart.addProduct(product4);
        bulkDiscountCart.addProduct(product4);
        regularCart.addProduct(product5);
        discountCart.addProduct(product5);
        bulkDiscountCart.addProduct(product5);
        // Display each cart to test the different pricing strategies
        System.out.println("Regular Pricing Strategy:");
        regularCart.displayCart();

        System.out.println("\nDiscount Pricing Strategy:");
        discountCart.displayCart();

        System.out.println("\nBulk Discount Pricing Strategy:");
        bulkDiscountCart.displayCart();
    }
}