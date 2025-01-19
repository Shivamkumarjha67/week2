public class EmployeeRecord {
    public static void main(String[] args) {
        Manager manager1 = new Manager(102, "D101", 34322.45);
        manager1.getDepartment();
    }
}

class Employee {
    public int employeeId;
    protected String department;
    private double salary;

    Employee(int employeeId, String department, double salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    Manager(int employeeId, String department, double salary) {
        super(employeeId, department, salary);
    }

    public void getEmployeeId() {
        System.out.println("Employee Id is " + employeeId);
    }

    public void getDepartment() {
        System.out.println("Department name is " + department);
    }
}