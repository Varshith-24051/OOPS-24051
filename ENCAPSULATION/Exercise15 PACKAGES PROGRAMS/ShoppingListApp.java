import java.util.*;
import java.io.*;
import java.lang.*;

public class ShoppingListApp {
 public static void main(String[] args) {
 List<String> shoppingList = new ArrayList<>();
 shoppingList.add("Apples");
 shoppingList.add("Bananas");
 shoppingList.add("Oranges");

try (FileWriter writer = new FileWriter("shopping_list.txt")) {
  writer.write("Shopping List:\n");
for (String item : shoppingList) {
    writer.write(item + "\n");
 }
  System.out.println("Shopping list written to file.");
 } catch (IOException e) {
   System.out.println("Error: " + e.getMessage());
 }
System.out.println("\nShopping List in Uppercase:");
for (String item : shoppingList) {
System.out.println(item.toUpperCase());
}
}
}
