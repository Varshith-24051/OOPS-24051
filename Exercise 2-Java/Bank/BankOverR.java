class Bank {
void service() {
System.out.println("Bank provides financial services.");
}
}

class Branch extends Bank {
@Override
void service() {
System.out.println("Branch provides customer support and account management.");
}
}

class Customer extends Branch {
@Override
void service() {
System.out.println("Customer uses banking services for deposits and withdrawals.");
}
}

public class BankOverR {
public static void main(String[] args) {
Customer customer = new Customer();
customer.service(); 
}
}
