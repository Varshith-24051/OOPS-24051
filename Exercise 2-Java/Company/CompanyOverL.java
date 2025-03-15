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
void employeeDetails(String name) {
System.out.println("Employee: " + name);
}
void employeeDetails(String name, String role) {
System.out.println("Employee: " + name);
System.out.println("Role: " + role);
}
void employeeDetails(String name, String role, int id) {
System.out.println("Employee ID: " + id);
System.out.println("Employee: " + name);
System.out.println("Role: " + role);
}
}

public class CompanyOverL {
public static void main(String[] args) {
Employee emp = new Employee();
emp.companyName();
emp.departmentName();
emp.employeeDetails(); 
emp.employeeDetails("Alice Smith"); 
emp.employeeDetails("Bob Johnson", "Project Manager"); 
emp.employeeDetails("Charlie Brown", "UI/UX Designer", 101);
}
}
