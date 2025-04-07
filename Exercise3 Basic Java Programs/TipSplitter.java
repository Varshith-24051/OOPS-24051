import java.util.Scanner;

class TipSplitter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter total bill amount: ");
double bill = sc.nextDouble();
System.out.print("Enter tip percentage: ");
int tip = sc.nextInt();
System.out.print("Enter number of people: ");
int people = sc.nextInt();

double total = bill + (bill * tip / 100);
double perPerson = total / people;

System.out.printf("Each person should pay: ₹%.2f\n", perPerson);
}
}
