import java.util.*;
import java.io.*;
import java.net.*;
import java.time.*;
import java.math.*;

public class FinanceApp {
private List<String> expenses;
private Map<String, BigDecimal> expenseAmounts;

public FinanceApp() {
expenses = new ArrayList<>();
expenseAmounts = new HashMap<>();
}

public void addExpense(String expense, BigDecimal amount) {
expenses.add(expense);
expenseAmounts.put(expense, amount);
logTransaction(expense + " - " + amount);
checkExpenseLimit(amount);
}

public void generateReport() {
BigDecimal total = BigDecimal.ZERO;
System.out.println("Monthly Expense Report:");
for (String expense : expenses) {
System.out.println(expense + ": " + expenseAmounts.get(expense));
total = total.add(expenseAmounts.get(expense));
}
System.out.println("Total Expenses: " + total);
saveReportToFile(total);
}

private void logTransaction(String transaction) {
try (FileWriter writer = new FileWriter("finance_log.txt", true)) {
writer.write(LocalDateTime.now() + " - " + transaction + "\n");
} catch (IOException e) {
System.out.println("Error logging transaction: " + e.getMessage());
}
}

private void saveReportToFile(BigDecimal total) {
try (FileWriter writer = new FileWriter("monthly_report.txt")) {
writer.write("Monthly Expenses Report:\n");
writer.write("Total Expenses: " + total);
} catch (IOException e) {
System.out.println("Error saving report: " + e.getMessage());
}
}

private void checkExpenseLimit(BigDecimal amount) {
BigDecimal limit = new BigDecimal("500.00");
if (amount.compareTo(limit) > 0) {
sendAlert("Large expense detected: " + amount);
}
}

private void sendAlert(String message) {
try {
URL url = new URL("https://api.notification-service.com/send");
System.out.println("Sending alert: " + message);
} catch (MalformedURLException e) {
System.out.println("Error with the URL: " + e.getMessage());
}
}

public static void main(String[] args) {
FinanceApp financeApp = new FinanceApp();
financeApp.addExpense("Groceries", new BigDecimal("100.50"));
financeApp.addExpense("Electric Bill", new BigDecimal("200.75"));
financeApp.addExpense("New Laptop", new BigDecimal("1200.00"));
financeApp.generateReport();
}
}
