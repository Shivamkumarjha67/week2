abstract class Vehicle implements GPS{
    // attributes
    // Secure driver and vehicle details using encapsulation.
    private int vehicleId;
    private String driverName;
    public int ratePerKm = 10;

    // Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
    abstract double calculateFare(double distance);

    // printing details
    void getVehicleDetails() {
        System.out.println("The id of vehicle is : "+ vehicleId+ " driver name is : "+ driverName + " and rate / km is : "+ ratePerKm);
    }
    Vehicle (String driverName, int vehicleId){
        this.driverName = driverName;
        this.vehicleId = vehicleId;
    }
}