import java.util.ArrayList;

// OutPatient subclass extends Patient class
public class OutPatient extends Patient {

    // Attributes
    private int numberOfDays;
    private double ratePerDay;

    // Parameterized constructor
    OutPatient(String name, String patientId, String diagnosis, int age, int numberOfDays, double ratePerDay) {
        super(name, patientId, diagnosis, age);
        this.numberOfDays = numberOfDays;
        this.ratePerDay = ratePerDay;
    }

    // Overridden methods
    @Override
    public void calculateBill() {
        double billForPatient = numberOfDays * ratePerDay;
        System.out.println("Bill for the patient throughout is " + billForPatient);
    }

    @Override
    public void addRecord(ArrayList<Patient> patients) {
        patients.add(this);
    }

    public void viewRecord() {
        getPatientDetails();
        System.out.println("For " + numberOfDays + " of days and a/c to " + ratePerDay + " rate per day.");
    }
}
