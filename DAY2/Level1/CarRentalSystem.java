public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Yuvi", "XUV", 5);
        rental1.calculateCost();
    }
}

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int eachDaycost = 400;

    // Parameterized constructor for providing the details about rentals
    CarRental(String name, String model, int numberOfDays) {
        this.customerName = name;
        this.carModel = model;
        this.rentalDays = numberOfDays;
    }

    // Calculate the cost of rental based on the number of days granted for
    public void calculateCost() {
        int costToPay = eachDaycost * rentalDays;
        System.out.println(customerName + " has to pay an amount of " + costToPay + " for the rental of " + carModel + " for " + rentalDays + " days.");
    }
}