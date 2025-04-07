import java.util.Scanner;

class BusFare {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter distance (km): ");
double km = sc.nextDouble();
System.out.print("Enter age: ");
int age = sc.nextInt();

double rate = 2.0;
if (age < 12 || age > 60) rate = 1.5;

double fare = km * rate;
System.out.printf("Total fare: ₹%.2f\n", fare);
}
}
