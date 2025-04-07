abstract class LibraryItem {
protected String title;
public LibraryItem(String title) {
this.title = title;
}
public String getTitle() {
return title;
}
public abstract void displayInfo();
}
class Book extends LibraryItem {
private String author;
private String isbn;
public Book(String title, String author, String isbn) {
super(title);
this.author = author;
this.isbn = isbn;
}
public void displayInfo() {
System.out.println("Book: " + title + ", Author: " + author + ", ISBN: " + isbn);
}
}
abstract class LibraryMember {
protected String memberId;
protected String name;
public LibraryMember(String memberId, String name) {
this.memberId = memberId;
this.name = name;
}
public String getMemberId() {
return memberId;
}
public String getName() {
return name;
}
public abstract void displayMemberInfo();
}
class Student extends LibraryMember {
public Student(String memberId, String name) {
super(memberId, name);
}
public void displayMemberInfo() {
System.out.println("Student ID: " + memberId + ", Name: " + name);
}
}
class Professor extends LibraryMember {
public Professor(String memberId, String name) {
super(memberId, name);
}
public void displayMemberInfo() {
System.out.println("Professor ID: " + memberId + ", Name: " + name);
}
}
public class LibraryAbstraction {
public static void main(String[] args) {
Book book1 = new Book("Java Programming", "TEST 2 ", "9848677051");
Student student1 = new Student("S101", "TEST1 ");
Professor professor1 = new Professor("P201", "Test 3");
book1.displayInfo();
student1.displayMemberInfo();
professor1.displayMemberInfo();
}
}