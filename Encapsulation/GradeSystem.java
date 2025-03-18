import java.util.*;

class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }

    public int getMarks() {
        return this.marks;
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

class GradeSystem {
    public static void main(String[] args) {
        System.out.println("------------------Start------------------------");

        Student student1 = new Student("testname", 85);

        System.out.println("Version 1");
        System.out.println("Name: " + student1.getName());
        System.out.println("Marks: " + student1.getMarks());
        System.out.println("Grade: " + student1.getGrade());

        student1.setMarks(92);

        System.out.println("\nVersion 2");
        System.out.println("Name: " + student1.getName());
        System.out.println("Marks: " + student1.getMarks());
        System.out.println("Grade: " + student1.getGrade());

        student1.setMarks(105);
    }
}
