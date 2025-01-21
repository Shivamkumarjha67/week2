public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating the object of vehicle type
        Vehicle vehicle1 = new Vehicle("Shivam", "XUV", 45);
        // Updating the registration fee, using the static member
        Vehicle.updateRegistrationFee(1099);
        // Displaying the details of the registration
        vehicle1.displayRegistrationDetails();
    }
}

// Vehicle class definition
class Vehicle {
    // Static members
    static double registrationFee = 500.0;
    static void updateRegistrationFee(double fees) {
        registrationFee = fees;
    }

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;

    // Parameterized constructor
    Vehicle(String ownerName, String vehicleType, int regNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = regNumber;
    }

    // Method for displaying the registration details
    public void displayRegistrationDetails() {
        System.out.println("Registration cost of " + vehicleType + " is " + registrationFee);
    }
}
