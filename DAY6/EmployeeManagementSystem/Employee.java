// Abstract class Employee with fields like employeeId, name, and baseSalary.
//Provide an abstract method calculateSalary() and a concrete method displayDetails().

public abstract class Employee implements Department {
    // Attributes of abstract class
    private String employeeId;
    private String name;
    private double baseSalary;
    private String departmentName;

    // Parameterized constructor
    Employee(String employeeId, String name, double baseSalary, String departmentName) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.departmentName = departmentName;
    }

    // Getters and Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    // Abstract method
    public abstract void calculateSalary();
    public abstract void employeeStatus();

    // public method of the abstract class
    public void displayDetails() {
        System.out.println("Name of the employee is " + name + " and his employee id is " + employeeId + ". His base salary is " + baseSalary);
    }
}
