// EmployeeDetatils class declaration having main methods
public class EmployeeDetails {
	public static void main(String[] args) {
		// Creating the object of employee class
		Employee emp1 = new Employee("Shivam Kumar Jha", 101, 47500.0);
		// Calling method of employee class for displaying details
		emp1.getDetails();
	}
}

// Employee class declaration and defination
class Employee {
	// Attributes of employee class
	private String name;
	private int id;
	private double salary;
	
	// Constructor of the employee class, used for the initialization of the variables
	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	// Behaviour of the employee class
	public void getDetails() {
		System.out.println("Employee name is " + name + " having id " + id + " and salary " + salary);
	}
}
