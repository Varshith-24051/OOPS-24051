import java.io.FileWriter;
import java.io.IOException;

public class CreateRecipe {
public static void main(String[] args) {
try {
FileWriter writer = new FileWriter("drink_recipe.txt");
writer.write("Drink Name: Strawberry Matcha Latte\n");
writer.write("Ingredients:\n- Strawberry puree\n- Matcha\n- Milk\n- Tapioca pearls\n");
writer.write("Steps:\n1. Add puree\n2. Add ice & milk\n3. Pour matcha on top\n");
writer.close();
System.out.println("Drink recipe saved to file!");
} catch (IOException e) {
System.out.println("Something went wrong while writing to the file.");
e.printStackTrace();
}
}
}
