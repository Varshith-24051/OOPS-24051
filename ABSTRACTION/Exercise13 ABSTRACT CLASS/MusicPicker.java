import java.util.Scanner;

interface MusicMood {
void playTrack();
}

class ChillVibes implements MusicMood {
public void playTrack() {
System.out.println(" Playing: 'Lo-Fi Study Beats'");
}
}

class WorkoutBoost implements MusicMood {
public void playTrack() {
System.out.println(" Playing: 'High Energy Workout Mix'");
}
}

public class MusicPicker {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your mood (chill/workout): ");
String mood = sc.nextLine();

MusicMood music;

if (mood.equalsIgnoreCase("chill")) {
music = new ChillVibes();
} else if (mood.equalsIgnoreCase("workout")) {
music = new WorkoutBoost();
} else {
System.out.println(" Unknown mood. Playing default track.");
music = new ChillVibes();
}

music.playTrack();
sc.close();
}
}
