public class UniversityManagementSystem {
    public static void main(String[] args) {
        PostgraduateStudent student1 = new PostgraduateStudent("Shivam", 121, 9.2);
        student1.getCGPA();
        student1.modifyCGPA(8.19);
        student1.displayPostGraduate();
    }
}

// Student class definition
class Student {
    // Attributes of student
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(String name, int rollNumber, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method to get CGPA
    public void getCGPA() {
        System.out.println("CGPA of the " + name + " is " + cgpa);
    }

    // Method to modify the CGPA
    public void modifyCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Post graduate class definition
class PostgraduateStudent extends Student {
    PostgraduateStudent(String name, int rollNumber, double cgpa) {
        super(name, rollNumber, cgpa);
    }

    // Method to get detail of post graduate name
    public void displayPostGraduate() {
        System.out.println("Postgraduate student name is " + name);
    }
}