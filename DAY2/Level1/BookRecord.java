public class BookRecord {
    public static void main(String[] args) {
        // Creating the first object of Book class
        Book book1 = new Book("Play with numbers", "R.S.Aggarwal", 459.99);
        book1.displayBookDetails();
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    Book() {}

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Displaying details about book
    public void displayBookDetails() {
        System.out.println("Book title is: " + title + " and author name is " + author + ". And it's price is " + price);
    }
}