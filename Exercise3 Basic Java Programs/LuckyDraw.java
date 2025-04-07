import java.util.*;

class LuckyDraw {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of participants: ");
int n = sc.nextInt();
String[] names = new String[n];

System.out.println("Enter names:");
for (int i = 0; i < n; i++) {
names[i] = sc.next();
}

Random rand = new Random();
int winnerIndex = rand.nextInt(n);
System.out.println("🎉 Winner is: " + names[winnerIndex]);
}
}
