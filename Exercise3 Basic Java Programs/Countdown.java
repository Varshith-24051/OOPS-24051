class Countdown {
public static void main(String[] args) throws InterruptedException {
System.out.println("Exam will start in:");
for (int i = 5; i >= 1; i--) {
System.out.println(i + " seconds...");
Thread.sleep(1000);
}
System.out.println("Begin Exam!");
}
}
