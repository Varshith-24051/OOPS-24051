import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        int time = sc.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();

        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);

        sc.close();
    }
}
