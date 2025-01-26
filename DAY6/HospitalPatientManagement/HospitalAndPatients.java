import java.util.ArrayList;

public class HospitalAndPatients {
    public static void main(String[] args) {
        // List of the patients
        ArrayList<Patient> patients = new ArrayList<>();

        // InPatient object created and added
        InPatient patient1 = new InPatient("Raj", "IP123", "Heart", 29, 1457.87);
        patient1.addRecord(patients);

        InPatient patient2 = new InPatient("Rajesh", "IP177", "Kidney", 23, 450.99);
        patient2.addRecord(patients);

        InPatient patient3 = new InPatient("Raju", "IP343", "Teeth", 56, 999.77);
        patient3.addRecord(patients);

        // OutPatient object created and added
        OutPatient patient4 = new OutPatient("Sahil", "OP453", "Heart", 49, 13, 888);
        patient4.addRecord(patients);

        OutPatient patient5 = new OutPatient("Pojo", "OP193", "Kidney", 79, 33, 987);
        patient5.addRecord(patients);

        OutPatient patient6 = new OutPatient("Khilal", "OP121", "Teeth", 23, 12, 766);
        patient6.addRecord(patients);

        // Iterating the patient loop
        for(Patient patient : patients) {
            patient.viewRecord();
            patient.calculateBill();
            System.out.println("------------------------------");
        }
    }
}
