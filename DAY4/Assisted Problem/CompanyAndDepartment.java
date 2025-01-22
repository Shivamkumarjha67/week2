import java.util.ArrayList;
import java.util.Scanner;

public class CompanyAndDepartment {
    public static void main(String[] args) {
        Company shiv = new Company("Shiv", 1999, 2);
        shiv.getCompanyDetails();
    }
}

class Company {
    // Attributes of the Company class
    private String name;
    private int estYear;
    private int numberOfDepartment = 1;
    private ArrayList<Department> departments = new ArrayList<>();

    // Inititalizing the scanner object
    private Scanner input;

    // Parameterized constructor
    Company(String name, int estYear, int numberOfDepartment) {
        this.name = name;
        this.estYear = estYear;
        this.numberOfDepartment = numberOfDepartment;
        input = new Scanner(System.in);
        addAllDepartmentDetails();
    }

    // Department class definition
    private class Department {
        private String depName;
        private int numberOfEmployees = 1;
        private ArrayList<Employee> employees;

        Department(String depName, int numberOfEmployees) {
            this.depName = depName;
            this.numberOfEmployees = numberOfEmployees;
            employees = new ArrayList<>();
            addAllEmployees();
        }
    
        private class Employee {
            // Attributes of employee class
            private String empName;
            private int empAge;

            // Parameterized constructor
            Employee(String name, int age) {
                this.empName = name;
                this.empAge = age;
            }

            // Displaying the details of employee
            public void showEmployeeDetails() {
                System.out.println("Employee created, Employee name is " + empName + " and his age is " + empAge);
            }
        }

        private void addAllEmployees() {
            for(int i=0; i<numberOfEmployees; i++) {
                System.out.println("Enter the detail of " + (i + 1) + " employee: (name, age) ");
                String empName = input.next();
                int age = input.nextInt();

                Employee employee = new Employee(empName, age);
                employees.add(employee);
                employee.showEmployeeDetails();
            }
        }

        public void showAllEmployees() {
            for(Employee employee : employees) {
                System.out.println("Employee name is " + employee.empName);
            }
        }
    }

    // Method for getting all department details
    private void addAllDepartmentDetails() {
        for(int i=0; i<numberOfDepartment; i++) {
            System.out.println("Enter the " + (i + 1) + " department details: ");
            String depName = input.next();
            int numberOfEmployees = input.nextInt();

            Department department = new Department(depName, numberOfEmployees);
            departments.add(department);
        }

        input.close();
    }

    // Method for displaying all the department details within the company
    private void getAllDepartmentDetails() {
        for(Department department : departments) {
            System.out.println("Department name is: " + department.depName + " and number of employee work here is " + department.numberOfEmployees);
            department.showAllEmployees();
            System.out.println("----------------------------------");
        }
    }

    // Method for getting the company details
    public void getCompanyDetails() {
        System.out.println("Company name is " + name + " it was established in the year " + estYear);
        getAllDepartmentDetails();
    }
}