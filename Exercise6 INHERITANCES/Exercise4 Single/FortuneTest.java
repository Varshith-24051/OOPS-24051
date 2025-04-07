import java.util.Random;

class FortuneMessage {
protected String[] messages = {
"Today is your lucky day!",
"Big things are coming.",
"Trust your instincts.",
"Someone is thinking of you."
};

String getMessage() {
Random rand = new Random();
return messages[rand.nextInt(messages.length)];
}
}

class LuckyFortune extends FortuneMessage {
private int luckyNumber;

LuckyFortune() {
Random rand = new Random();
this.luckyNumber = rand.nextInt(100);
}

void printFortune() {
System.out.println(" Your Fortune: " + getMessage());
System.out.println(" Lucky Number: " + luckyNumber);
}
}

public class FortuneTest {
public static void main(String[] args) {
LuckyFortune lf = new LuckyFortune();
lf.printFortune();
}
}