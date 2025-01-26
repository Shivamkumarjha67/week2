class Car extends Vehicle{
    @Override
    double calculateFare(double distance) {

        return distance * ratePerKm;
    }

    // methods to  getCurrentLocation() and updateLocation().
    public String getCurrentLocation(){
        return("getting cur locaton");
    };
    public String updateLocation() {
        return("updating current location");
    };

    // constructor
    Car(int ratePerKm, String driverName, int vehicleId) {
        super(driverName, vehicleId);
        this.ratePerKm = ratePerKm;
    }

    // invoking the super method to get details
    @Override
    void getVehicleDetails() {
        super.getVehicleDetails();
    }
}