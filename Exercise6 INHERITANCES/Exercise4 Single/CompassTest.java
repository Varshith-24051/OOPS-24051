import java.util.Random;

class Compass {
protected String[] directions = {"North", "East", "South", "West"};

void showDirection() {
    int i = new Random().nextInt(directions.length);
    System.out.println(" Direction: " + directions[i]);
}
}

class SmartCompass extends Compass {
void showDegrees() {
    int degrees = new Random().nextInt(360);
    System.out.println(" Orientation: " + degrees + "°");
}
}

public class CompassTest {
public static void main(String[] args) {
    SmartCompass sc = new SmartCompass();
    sc.showDirection();
    sc.showDegrees();
}
}
