import java.util.ArrayList;

public class RideHailing {
    public static void main(String[] args) {
        // List of the vehicle
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // creating some example objects from classes
        Vehicle car1 = new Car(109, "Shivam jha", 985);
        Vehicle auto1 = new Auto(96, "sahil", 2143);
        Vehicle bike1 = new Bike(55, "ewe", 432);

        vehicles.add(car1);
        vehicles.add(auto1);
        vehicles.add(bike1);

        for(Vehicle vehicle : vehicles) {
            vehicle.getCurrentLocation();
            vehicle.updateLocation();
            System.out.println("Fare of vehicle for given distance is "+ vehicle.calculateFare((int)(Math.random()*100)));
            vehicle.getVehicleDetails();
            System.out.println("--------------------------------");
        }
    }
}