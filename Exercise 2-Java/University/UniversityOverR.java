class University {
void universityName() {
System.out.println("University: Oxford University");
}
void details() {
System.out.println("University has multiple faculties.");
}
}

class Faculty extends University {
@Override
void details() {
System.out.println("Faculty offers various programs in Computer Science.");
}
}

class Student extends Faculty {
@Override
void details() {
System.out.println("Student is enrolled in a Computer Science program.");
}
}

public class UniversityOverR {
public static void main(String[] args) {
Student student = new Student();
student.universityName();
student.details(); 
}
}
