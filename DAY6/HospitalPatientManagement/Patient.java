// Abstract class definition
public abstract class Patient implements MedicalRecord {
    // Attributes
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    // Parameterized constructor
    Patient(String name, String patientId, String diagnosis, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Abstract method
    public abstract void calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Name of the patient is " + name + " and his patient id is " + patientId + ". His age is " + age + ". His diagnosis is of " + diagnosis);
    }

    // Getters and Setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
