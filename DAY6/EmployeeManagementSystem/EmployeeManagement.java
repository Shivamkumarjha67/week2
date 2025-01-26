//Description: Build an employee management system with the following requirements:
//Use an abstract class Employee with fields like employeeId, name, and baseSalary.
//Provide an abstract method calculateSalary() and a concrete method displayDetails().
//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
//Use encapsulation to restrict direct access to fields and provide getter and setter methods.
//Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
//Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.


import java.util.ArrayList;

public class EmployeeManagement {
    public static void main(String[] args) {
        // List of the employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Employee of both class type part-time and full-time object created and added to the list
        Employee partTimeEmployee1 = new PartTimeEmployee("PE104", "Raj", 24000.34, "IT", 6.5);
        employees.add(partTimeEmployee1);
        Employee fullTimeEmployee1 = new FullTimeEmployee("FE344", "Pinky", 64099.23, "Computer Science", 8);
        employees.add(fullTimeEmployee1);
        Employee partTimeEmployee2 = new PartTimeEmployee("PE156", "Pankaj", 14500, "HR", 6.5);
        employees.add(partTimeEmployee2);
        Employee fullTimeEmployee2 = new FullTimeEmployee("FE191", "Raju", 74000.99, "IT", 8);
        employees.add(fullTimeEmployee2);

        // Displaying details about each employee
        for(Employee employee : employees) {
            employee.displayDetails();
            employee.getDepartmentDetails();
            employee.employeeStatus();
        }
    }
}
