public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Creating the student class object
        Student student1 = new Student("Shivam", 102, 'B');
        System.out.println("student1 is the instance of the Student: " + (student1 instanceof Student));

        // student1 object is used for updating and displaying
        student1.displayDetails();
        student1.updateGrade('A');
        student1.displayDetails();
    }
}

class Student {
    // static memebers of the class Student
    static int numberOfStudent = 0;
    static String universityName = "RGPV";
    static void displayTotalStudent() {
        System.out.println("Total number of student enrolled is " + numberOfStudent);
    }

    // Instance variables
    private String name;
    // Making roll number as final
    private final int rollNumber;
    private char grade;

    // Parameterized constructor
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // displaying the student details
    public void displayDetails() {
        System.out.println("Name of the student is " + name + " and roll number of the student is " + rollNumber + " and gradee obtained is " + grade);
    }

    public void updateGrade(char grade) {
        this.grade = grade;
    }
}