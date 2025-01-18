import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    // private static int numberOfItems = 10; 
	private static String[] itemsName = {"Potatoes", "onions", "carrots", "salad greens", "broccoli", "peppers", "tomatoes", "cucumbers", "green chilies", "salt"};
    private static int[] prices = {40, 75, 48, 33, 67, 28, 72, 90, 56, 67};

	public static void main(String[] args) {
		// Creating the object of Cart class
		Cart cart1 = new Cart(itemsName, prices);
        cart1.addItem(3);
        cart1.displayTotalCost();
        cart1.addItem(8);
        cart1.displayTotalCost();
        cart1.addItem(2);
        cart1.addItem(5);
        cart1.displayTotalCost();
        cart1.addItem(5);
        cart1.displayTotalCost();
        cart1.addItem(9);

        cart1.displayTotalCost();
        cart1.removeItem(5);
        cart1.displayTotalCost();
	}
}

class Cart {
	// Attribute of CartItem class
    private int maximumCartSize = 25;
    private int itemPresentInCart = 0;
    private HashMap<Integer, Integer> itemsAdded = new HashMap<>();

    private String[] itemName;
    private int[] prices;

    Cart(String[] items, int[] prices) {
        this.itemName = items;
        this.prices = prices;
    }

    // Method of adding items
    public void addItem(int item) {
        if(itemPresentInCart >= maximumCartSize) {
            System.out.println("Cart is full. Remove some item first, then add new item in the cart.");
            return;
        }

        itemsAdded.put(item, itemsAdded.getOrDefault(item, 1) + 1);
    }

    // Method to display cost
    public void displayTotalCost() {
        int totalPrice = 0;

        for(Map.Entry<Integer, Integer> mp : itemsAdded.entrySet()) {
            totalPrice += (prices[mp.getKey()] * mp.getValue());
        }

        System.out.println("Sum of prices of all item is: " + totalPrice);
    }

    // Method of removing the items
    public void removeItem(int item) {
        if(!itemsAdded.containsKey(item)) {
            System.out.println("Item is not present in the cart.");
            return;
        }

        itemsAdded.remove(item);
        System.out.println("Item successfully removed from the cart.");
    }
}