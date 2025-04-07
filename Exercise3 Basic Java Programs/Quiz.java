import java.util.*;

class Quiz {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] questions = {
"What is the capital of France?",
"2 + 2 = ?",
"Java is a ___ language."
};
String[] answers = {"paris", "4", "programming"};
int score = 0;

for (int i = 0; i < questions.length; i++) {
System.out.println(questions[i]);
String userAns = sc.nextLine().toLowerCase();
if (userAns.equals(answers[i])) {
score++;
}
}
System.out.println("Your score: " + score + "/" + questions.length);
}
}
