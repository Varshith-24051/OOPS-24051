import java.util.Scanner;

class InterestCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter principal amount: ");
double principal = scanner.nextDouble();
System.out.print("Enter annual interest rate (%): ");
double rate = scanner.nextDouble();
System.out.print("Enter number of years: ");
int years = scanner.nextInt();

double amount = principal * Math.pow(1 + (rate / 100), years);
System.out.printf("Future value: %.2f\n", amount);
} catch (Exception e) {
System.out.println("Error in input: " + e.getMessage());
}
}
}
