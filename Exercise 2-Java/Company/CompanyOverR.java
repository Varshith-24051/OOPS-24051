class Company {
void companyName() {
System.out.println("Company: Tech Solutions Ltd.");
}
void work() {
System.out.println("Company handles various projects.");
}
}

class Department extends Company {
@Override
void work() {
System.out.println("Department focuses on software development.");
}
}

class Employee extends Department {
@Override
void work() {
System.out.println("Employee works on coding and debugging.");
}
}

public class CompanyOverR {
public static void main(String[] args) {
Employee emp = new Employee();
emp.companyName();
emp.work(); 
}
}
