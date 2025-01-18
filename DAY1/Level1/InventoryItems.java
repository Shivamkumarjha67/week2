// Item class declaration and definition
class Item {
	// Attribute of Item class
	private String itemCode;
	private String itemName;
	private double price;
	
	// Constructor of the item class, used for the initialization of the variables
	Item(String itemCode, String itemName, double price) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	// Behaviours of the Item class
	public void displayItemDetails() {
		System.out.println("Item name is " + itemName + " and it's code is " + itemCode + " having price of " + price);
	}
	
	public void displayCostOfGivenQuantity(int quantity) {
		double totalPriceOfItem = price * quantity;
		System.out.println("Price of " + quantity + " items will be: " + totalPriceOfItem);
	}
}

// InventoryItems class declaration having main methods
public class InventoryItems {
	public static void main(String[] args) {
		// Creating the object of Item class
		Item item = new Item("I101", "Axe", 500.0);
		// Calling method of Item class for displaying it's details
		item.displayItemDetails();
		
		// Checking the price of given quantity
		item.displayCostOfGivenQuantity(40);
	}
}