class Company {
void companyName() {
System.out.println("Company: Tech Solutions Ltd.");
}
}

class Department extends Company {
void departmentName() {
System.out.println("Department: Software Development");
}
}

class Employee extends Department {
void employeeDetails() {
System.out.println("Employee: John Doe");
System.out.println("Role: Software Engineer");
}
}

public class CompanyMain {
public static void main(String[] args) {
Employee emp = new Employee();
emp.companyName();
emp.departmentName();
emp.employeeDetails();
}
}
