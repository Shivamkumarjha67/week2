import java.util.ArrayList;

// InPatient subclass extending Patient class
public class InPatient extends Patient {
    // Attributes
    private final double inPatientFee;

    // Parameterized constructor
    InPatient(String name, String patientId, String diagnosis, int age, double inPatientFee) {
        super(name, patientId, diagnosis, age);
        this.inPatientFee = inPatientFee;
    }

    // Overridden method
    @Override
    public void calculateBill() {
        System.out.println("Fee needed for getting patient registered is " + inPatientFee);
    }

    @Override
    public void addRecord(ArrayList<Patient> patients) {
        patients.add(this);
        System.out.println(getName() + " is added to the patient record successfully...");
    }

    @Override
    public void viewRecord() {
        getPatientDetails();
        System.out.println("Fees of the getting registered is " + inPatientFee);
    }
}
