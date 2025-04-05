import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEpisodes {
public static void main(String[] args) {
try {
File file = new File("episodes.txt");
Scanner scanner = new Scanner(file);
System.out.println("Podcast Episodes:");
while (scanner.hasNextLine()) {
String line = scanner.nextLine();
System.out.println("- " + line);
}
scanner.close();
} catch (FileNotFoundException e) {
System.out.println("File not found.");
e.printStackTrace();
}
}
}
