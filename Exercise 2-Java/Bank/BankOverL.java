class Bank {
void bankName() {
System.out.println("Bank: National Bank");
}
}

class Branch extends Bank {
void branchLocation() {
System.out.println("Branch Location: New York");
}
}

class Customer extends Branch {
void customerDetails() {
System.out.println("Customer: Default Name");
System.out.println("Account Type: General");
}
void customerDetails(String name) {
System.out.println("Customer: " + name);
}
void customerDetails(String name, String accountType) {
System.out.println("Customer: " + name);
System.out.println("Account Type: " + accountType);
}
void customerDetails(String name, String accountType, double balance) {
System.out.println("Customer: " + name);
System.out.println("Account Type: " + accountType);
System.out.println("Balance: $" + balance);
}
}

public class BankOverL {
public static void main(String[] args) {
Customer customer = new Customer();
customer.bankName();
customer.branchLocation();
customer.customerDetails(); 
customer.customerDetails("Alice Smith"); 
customer.customerDetails("Bob Johnson", "Checking"); 
customer.customerDetails("Charlie Brown", "Business", 50000.75);
}
}
