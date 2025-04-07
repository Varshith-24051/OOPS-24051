class Product {
void displayDetails() {
System.out.println("🛒 Product: Generic item on the platform.");
}
}

class Electronic extends Product {
void techSpecs() {
System.out.println("🔌 Electronic: Battery life - 12h, Warranty - 2 years");
}
}

class Clothing extends Product {
void fabricInfo() {
System.out.println("👗 Clothing: Material - Organic Cotton, Size - M");
}
}

public class AmazonShopTest {
public static void main(String[] args) {
Electronic laptop = new Electronic();
Clothing tshirt = new Clothing();

laptop.displayDetails();
laptop.techSpecs();

System.out.println();

tshirt.displayDetails();
tshirt.fabricInfo();
}
}
