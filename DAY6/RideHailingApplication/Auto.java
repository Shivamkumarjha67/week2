class Auto extends Vehicle{

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
    Auto(int ratePerKm, String driverName, int vehicleId) {
        super(driverName, vehicleId);
        this.ratePerKm = ratePerKm;
    }

    @Override
    void getVehicleDetails() {
        super.getVehicleDetails();
    }
}
