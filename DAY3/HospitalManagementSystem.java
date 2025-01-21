public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Sandeep", 32, "Piles", 10);
        System.out.println("patient1 is the object of the type Patient class?: " + (patient1 instanceof Patient));
        patient1.displayPatientDetails();
    }
}

class Patient {
    // Static members
    static String hospitalName = "Apollo";
    static int numberOfPatients = 0;
    static void getTotalPatients() { 
        System.out.println("Total number of the patients is: " + numberOfPatients);
    }

    // Instance variables 
    private String name;
    private int age;
    private String ailment;

    // Parameterized constructor
    Patient(String name, int age, String ailment, int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
    }

    // Declaring the final variable for patient id, as it should be unique
    private final int patientId; 

    // Method for displaying the details of the patient
    public void displayPatientDetails() {
        System.out.println("Patient name is " + name + " and his age is " + age + ". He is suffering from " + ailment + ". His patient id is " + patientId);
    }
}