public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Declaration and initialization of the product object
        Product product1 = new Product("Rice", 34.50, 3, 345);
        // Checking whether the product1 is the instance of the class Product
        System.out.println("product1 is the instance of the class Product: " + (product1 instanceof Product));
        // Displaying the product details
        product1.getProductDetails();
    }
}

class Product {
    // Static variables of product class
    static double discountOnAll = 4;
    static void updateDiscount(double discount) {
        discountOnAll = discount;
    }

    // Instance variable of the class
    private String productName;
    private double price;
    private int quantity;
    // final variable of the class, as the product id needs to be ubnique
    public final int productId;

    // Parameterized constructor
    Product(String name, double price, int quantity, int id) {
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
        productId = id;
    }

    // Method for displaying the details of product
    public void getProductDetails() {
        System.out.println("Poduct name is " + productName + " and it's id is " + productId + ". Having the quantity of " + quantity + ". And price of each unit is " + price);
    }
}