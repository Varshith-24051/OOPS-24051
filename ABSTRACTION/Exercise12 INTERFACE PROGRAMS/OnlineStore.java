abstract class Product {
protected String productId;
protected String name;
protected double price;
public Product(String productId, String name, double price) {
this.productId = productId;
this.name = name;
this.price = price;
}
public String getProductId() {
return productId;
}
public String getName() {
return name;
}
public double getPrice() {
return price;
}
public abstract void displayProductInfo();
}
class Electronic extends Product {
private String brand;
private String model;
public Electronic(String productId, String name, double price, String brand, String model) {
super(productId, name, price);
this.brand = brand;
this.model = model;
}
public void displayProductInfo() {
System.out.println("Electronic: " + name + ", Brand: " + brand + ", Model: " + model + ", Price: $" + price);
}
}
class Clothing extends Product {
private String size;
private String color;
public Clothing(String productId, String name, double price, String size, String color) {
super(productId, name, price);
this.size = size;
this.color = color;
}
public void displayProductInfo() {
System.out.println("Clothing: " + name + ", Size: " + size + ", Color: " + color + ", Price: $" + price);
}
}
class Customer {
private String customerId;
private String name;
public Customer(String customerId, String name) {
this.customerId = customerId;
this.name = name;
}
public void displayCustomerInfo() {
System.out.println("Customer ID: " + customerId + ", Name: " + name);
}
}
class Order {
private Customer customer;
private Product product;
public Order(Customer customer, Product product) {
this.customer = customer;
this.product = product;
}
public void displayOrderInfo() {
System.out.println("Order:");
customer.displayCustomerInfo();
product.displayProductInfo();
}
}
public class OnlineStore {
public static void main(String[] args) {
Electronic laptop = new Electronic("E001", "Laptop", 1200.0, "Dell", "XPS 13");
Clothing shirt = new Clothing("C001", "T-Shirt", 25.0, "Large", "Blue");
Customer customer = new Customer("C101", "Bob");
Order order = new Order(customer, laptop);
laptop.displayProductInfo();
shirt.displayProductInfo();
customer.displayCustomerInfo();
order.displayOrderInfo();
}
}