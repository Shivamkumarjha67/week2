public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course1 = new Course("Java", 6, 65000.0);
        course1.displayCourseDetails();
        Course.updateInstituteName("BridgeLabz");
    }
}

class Course {
    private String courseName;
    private double fees;
    static String instituteName = "TIT";
    private int duration;

    Course(String courseName, int duration, double fees) {
        this.courseName = courseName;
        this.fees = fees;
        this.duration = duration;
    }

    // Method for displaying the details of course
    public void displayCourseDetails() {
        System.out.println("Course name is " + courseName + " and it will last for " + duration + " months. Fees of this course will be " + fees);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}