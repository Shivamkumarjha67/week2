// MobilePhone class declaration and definition
class MobilePhone {
	// Attribute of Item class
	private String brand;
	private String model;
	private double price;
	
	// Constructor of the MobilePhone class, used for the initialization of the variables
	MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// Behaviours of the MobilePhone class
	public void displayMobilePhoneDetails() {
		System.out.println("Mobile phone brand name is " + brand + " and it's model is " + model + " having price of " + price);
	}
}

// InventoryItems class declaration having main methods
public class MobilePhoneDetails {
	public static void main(String[] args) {
		// Creating the object of Item class
		MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy101", 25500.0);
		// Calling method of Item class for displaying it's details
		phone1.displayMobilePhoneDetails();		
	}
}