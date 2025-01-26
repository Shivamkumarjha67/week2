//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.

// FullTimeEmployee class definition
public class FullTimeEmployee extends Employee {
    public double workHours;

    FullTimeEmployee(String employeeId, String name, double baseSalary, String departmentName, double workHours) {
        super(employeeId, name, baseSalary, departmentName);
        this.workHours = workHours;
    }

    @Override
    public void calculateSalary() {
        double salary = workHours * getBaseSalary();
        System.out.println(getName() + " salary is " + salary);
    }

    @Override
    public void assignDepartment(String departmentName) {
        setDepartmentName(departmentName);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("He works for the department named as " + getDepartmentName());
    }

    @Override
    public void employeeStatus() {
        System.out.println(getName() + " is a full time employee!!");
    }
}
