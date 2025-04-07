package flipkart.customer;

import flipkart.Product;

public class CustomerOrder {
    private String customerName;
    private Product product;

    public CustomerOrder(String customerName) {
        this.customerName = customerName;
    }

    public void placeOrder(Product product) {
        this.product = product;
        System.out.println("Order placed by: " + customerName);
        product.displayProductInfo();
    }
}
