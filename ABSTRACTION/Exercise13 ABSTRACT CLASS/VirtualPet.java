import java.util.Scanner;
import java.util.Random;

interface PetAction {
void doAction();
}

class Feed implements PetAction {
public void doAction() {
System.out.println(" You fed your pet. It's full and happy!");
}
}

class Play implements PetAction {
public void doAction() {
System.out.println(" You played fetch. Your pet is excited!");
}
}

class Sleep implements PetAction {
public void doAction() {
System.out.println(" Your pet curled up and is now sleeping peacefully.");
}
}

public class VirtualPet {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rand = new Random();
System.out.println(" Welcome to your Virtual Pet!");

String[] options = {"feed", "play", "sleep"};
PetAction action = null;

System.out.print("Choose an action (feed/play/sleep/random): ");
String input = sc.nextLine().toLowerCase();

switch (input) {
case "feed":
action = new Feed();
break;
case "play":
action = new Play();
break;
case "sleep":
action = new Sleep();
break;
case "random":
int r = rand.nextInt(3);
if (r == 0) action = new Feed();
else if (r == 1) action = new Play();
else action = new Sleep();
System.out.println(" Random action selected.");
break;
default:
System.out.println(" Unknown command. Pet is confused...");
System.exit(0);
}

action.doAction();
System.out.println(" Your pet sends you a tail wag! ");
sc.close();
}
}
