public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Vitara", "XUV");
        vehicle1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(4500);
    }
}

class Vehicle {
    private String name;
    private String vehicleType;
    public static double registrationFee = 8900.5;

    Vehicle(String name, String vehicleType) {
        this.name = name;
        this.vehicleType = vehicleType;
    }

    // Method for displaying the vehicle details by parameterized constructor
    public void displayVehicleDetails() {
        System.out.println("Vehicle name is " + name + " and it's type is " + vehicleType + ". Registration fees is " + registrationFee);
    }

    // Method for updating the registration fee
    public static void updateRegistrationFee(double fees) {
        registrationFee = fees;
    }
}