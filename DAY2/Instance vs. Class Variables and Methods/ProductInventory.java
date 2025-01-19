public class ProductInventory {
    public static void main(String[] args) {
        Product product1 = new Product("Mango", 440);
        product1.displayProductDetails();
        Product.displayTotalProducts();
    }
}

class Product {
    private String productName;
    private double price;
    static int totalProduct = 20;

    // Parameterized constructor
    Product(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    // Display user detail
    public void displayProductDetails() {
        System.out.println("Product name is: " + productName + " and it's price is " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total product number is " + totalProduct);
    }
}