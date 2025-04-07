import java.util.*;

class Movie {
String title;
String genre;
String mood;

Movie(String title, String genre, String mood) {
this.title = title;
this.genre = genre;
this.mood = mood;
}

void display() {
System.out.println( title + " | Genre: " + genre + " | Mood: " + mood);
}
}

class MovieMoodBot {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Movie> movies = new ArrayList<>();

movies.add(new Movie("The Pursuit of Happyness", "Drama", "motivated"));
movies.add(new Movie("Inside Out", "Animation", "sad"));
movies.add(new Movie("The Hangover", "Comedy", "funny"));
movies.add(new Movie("Interstellar", "Sci-Fi", "curious"));
movies.add(new Movie("Inception", "Thriller", "mind-blown"));
movies.add(new Movie("La La Land", "Romance", "romantic"));
movies.add(new Movie("The Dark Knight", "Action", "intense"));

System.out.println(" What's your mood right now? (e.g., sad, funny, romantic, curious, motivated)");
System.out.print(" Mood: ");
String mood = sc.nextLine().toLowerCase();

System.out.println("\n Recommending movies for mood: " + mood + "\n");

boolean found = false;
for (Movie m : movies) {
if (m.mood.equalsIgnoreCase(mood)) {
m.display();
found = true;
}
}

if (!found) {
System.out.println(" Sorry, I don’t have any suggestions for that mood.");
System.out.println("But maybe try 'funny' or 'motivated'?");
} else {
System.out.println("\n Hope you enjoy your movie!");
}
}
}
