import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JournalAnalyzer {
public static void main(String[] args) {
int wordCount = 0;

try {
File file = new File("journal_entry.txt");
Scanner input = new Scanner(file);

while (input.hasNext()) {
input.next();
wordCount++;
}

input.close();
System.out.println("Total words in the file: " + wordCount);
} catch (FileNotFoundException e) {
System.out.println("File not found.");
}
}
}
