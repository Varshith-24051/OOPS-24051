public class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }

    public String getGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

public class MarksSystem {

    public static void main(String[] args) {
        Student student1 = new Student("John", 85);

        System.out.println("Student Name: " + student1.getName());
        System.out.println("Marks: " + student1.getMarks());
        System.out.println("Grade: " + student1.getGrade());

        student1.setMarks(92);
        System.out.println("\nAfter updating marks:");
        System.out.println("Marks: " + student1.getMarks());
        System.out.println("Grade: " + student1.getGrade());

        student1.setMarks(105);
    }
}

