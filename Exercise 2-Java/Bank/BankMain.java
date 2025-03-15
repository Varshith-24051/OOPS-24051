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
System.out.println("Customer: John Doe");
System.out.println("Account Type: Savings");
}
}

public class BankMain {
public static void main(String[] args) {
Customer customer = new Customer();
customer.bankName();
customer.branchLocation();
customer.customerDetails();
}
}
