import java.util.Scanner;

class OrderSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double total = 0;
int choice;

do {
System.out.println("1. Burger ₹50\n2. Pizza ₹100\n3. Soda ₹20\n0. Exit");
System.out.print("Select item: ");
choice = sc.nextInt();

switch (choice) {
case 1: total += 50; break;
case 2: total += 100; break;
case 3: total += 20; break;
case 0: break;
default: System.out.println("Invalid choice");
}
} while (choice != 0);

System.out.println("Total Bill: ₹" + total);
}
}
