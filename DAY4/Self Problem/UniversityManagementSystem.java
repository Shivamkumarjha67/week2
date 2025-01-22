import java.util.ArrayList;
import java.util.List;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create objects
        Student raj = new Student("Raj");
        Student pankaj = new Student("Pankaj");
        Professor sumit = new Professor("Sumit");
        Professor raju = new Professor("Raju");
        Course math101 = new Course("Math 101");
        Course english101 = new Course("English 101");

        // Assign professor to courses
        math101.setProfessor(sumit);
        english101.setProfessor(raju);

        // Enroll students in courses
        raj.enrollCourse(math101);
        raj.enrollCourse(english101);
        pankaj.enrollCourse(math101);

        // Display information
        System.out.println("Math 101 Professor: " + math101.getProfessor().getName());
        System.out.println("Students enrolled in Math 101:");
        for (Student student : math101.getEnrolledStudents()) {
            System.out.println(" - " + student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.getName());
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

class Professor {
    private String name;
    private List<Course> taughtCourses;

    public Professor(String name) {
        this.name = name;
        this.taughtCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        taughtCourses.add(course);
        System.out.println(name + " assigned to teach " + course.getName());
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }
}

class Course {
    private String name;
    private Professor professor; 
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}