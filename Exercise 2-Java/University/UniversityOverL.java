class University {
void universityName() {
System.out.println("University: Oxford University");
}
}

class Faculty extends University {
void facultyName() {
System.out.println("Faculty: Computer Science");
}
}

class Student extends Faculty {
void studentDetails() {
System.out.println("Student: Alice Johnson");
System.out.println("Program: BSc in Computer Science");
}
void studentDetails(String name) {
System.out.println("Student: " + name);
}
void studentDetails(String name, String program) {
System.out.println("Student: " + name);
System.out.println("Program: " + program);
}
void studentDetails(String name, String program, int year) {
System.out.println("Student: " + name);
System.out.println("Program: " + program);
System.out.println("Year: " + year);
}
}

public class UniversityOverL {
public static void main(String[] args) {
Student student = new Student();
student.universityName();
student.facultyName();
student.studentDetails(); 
student.studentDetails("Bob Williams"); 
student.studentDetails("Charlie Brown", "MSc in Data Science"); 
student.studentDetails("David Smith", "PhD in AI", 2025);
}
}
