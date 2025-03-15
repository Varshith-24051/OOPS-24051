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
}

public class UniversityMain {
public static void main(String[] args) {
Student student = new Student();
student.universityName();
student.facultyName();
student.studentDetails();
}
}
