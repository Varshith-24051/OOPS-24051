import java.util.*;

class ToDoList {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> tasks = new ArrayList<>();

while (true) {
System.out.println("\n1. Add Task\n2. Remove Task\n3. View Tasks\n4. Exit");
System.out.print("Choose: ");
int choice = sc.nextInt();
sc.nextLine();

switch (choice) {
case 1:
System.out.print("Enter task: ");
String task = sc.nextLine();
tasks.add(task);
break;
case 2:
System.out.print("Enter task number to remove: ");
int index = sc.nextInt();
if (index >= 1 && index <= tasks.size()) {
tasks.remove(index - 1);
System.out.println("Task removed.");
} else {
System.out.println("Invalid number.");
}
break;
case 3:
System.out.println("Your Tasks:");
for (int i = 0; i < tasks.size(); i++) {
System.out.println((i + 1) + ". " + tasks.get(i));
}
break;
case 4:
System.out.println("Exiting...");
return;
default:
System.out.println("Invalid option.");
}
}
}
}
