import java.util.*;

class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

class BankAccountSystem {
    public static void main(String[] args) {
        System.out.println("------------------Bank Account System------------------------");

        BankAccount account1 = new BankAccount("Testname", 1000);
        
        System.out.println("Account Holder: " + account1.getAccountHolder());
        System.out.println("Initial Balance: " + account1.getBalance());

        account1.deposit(500);
        System.out.println("Updated Balance after Deposit: " + account1.getBalance());

        account1.withdraw(200);
        System.out.println("Updated Balance after Withdrawal: " + account1.getBalance());

        account1.withdraw(1500);  // Attempting to withdraw more than balance
        System.out.println("Final Balance: " + account1.getBalance());
    }
}
