import java.util.*;

class Book {
String title, author;

Book(String title, String author) {
this.title = title;
this.author = author;
}

void display() {
System.out.println("Title: " + title + " | Author: " + author);
}
}

class Library {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Book> books = new ArrayList<>();

books.add(new Book("The Alchemist", "Paulo Coelho"));
books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
books.add(new Book("1984", "George Orwell"));
books.add(new Book("To Kill a Mockingbird", "Harper Lee"));

System.out.print("Enter a keyword to search for a book: ");
String keyword = sc.nextLine().toLowerCase();

boolean found = false;
for (Book b : books) {
if (b.title.toLowerCase().contains(keyword)) {
b.display();
found = true;
}
}

if (!found) {
System.out.println("No books found with that keyword.");
}
}
}
