public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Shivam", 34, "Technical");
        employee1.getEmployeeDetails();
        System.out.println("employee1 is the instance of class Employee: " + (employee1 instanceof Employee));
    }
}

class Employee {
    // Static members
    static int numberOfEmployees = 0;
    static String companyName = "Capgemini";
    static void displayTotalEmployees() {
        System.out.println("Total number of the employees are " + numberOfEmployees);
    }

    // Instance variables and methods
    private String name;
    private final int id;
    private String designation;

    // Parameterized constructor
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        numberOfEmployees++;
    }

    // Method for displaying the employee details
    public void getEmployeeDetails() {
        System.out.println("Company name is " + companyName + " and employee name " + name + " and employee id is " + id + ".His designation is " + designation);
    }
}