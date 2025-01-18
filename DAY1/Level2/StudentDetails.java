class Student {
	// Attribute of Item class
	private String name;
	private int rollNum;
	private int marks;
	private String grade;
	
	// Constructor of the MobilePhone class, used for the initialization of the variables
	Student(String name, int rollNum, int marks) {
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
	}
	
	// Behaviours of the MobilePhone class
	public void displayStudentDetails() {
		System.out.println("Student name is " + name + ". His roll number is " + rollNum + ". Grade scored is: " + grade);
	}

	// Method for finding grades
	public void findGrade() {
		if (marks >= 90) {
            grade = "A+";
        }
        else if (marks >= 80) {
            grade = "A";
        }
        else if (marks >= 70) {
            grade = "B+";
        }
        else if (marks >= 60) {
            grade = "B";
        }
        else if (marks >= 50) {
            grade = "C+";
        }
        else if (marks >= 33) {
            grade = "C";
        }
        else {
            grade = "Fail";
        }
	}
}

// InventoryItems class declaration having main method
public class StudentDetails {
	public static void main(String[] args) {
		// Creating the object of Item class
		Student student1 = new Student("Yuvraj Singh Thakur", 69, 31);
		// Calling method of Item class for displaying it's details
		student1.findGrade();	
		student1.displayStudentDetails();	
	}
}