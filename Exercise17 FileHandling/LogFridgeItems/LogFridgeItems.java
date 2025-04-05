import java.io.FileWriter;
import java.io.IOException;

public class LogFridgeItems {
public static void main(String[] args) {
try {
FileWriter writer = new FileWriter("fridge_log.txt", true);
writer.write("Item: Greek Yogurt | Added: 2025-04-05 | Quantity: 4\n");
writer.close();
System.out.println("Item added to fridge log.");
} catch (IOException e) {
System.out.println("Error writing to the file.");
e.printStackTrace();
}
}
}
