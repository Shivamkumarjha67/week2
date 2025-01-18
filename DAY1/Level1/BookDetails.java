// BookDetails class declaration having main methods
public class BookDetails {
	public static void main(String[] args) {
		// Creating the object of Book class
		Book book = new Book("Autobiography of a Yogi", "Paramahansa Yogananda", 500.0);
		// Calling method of Book class for displaying it's details
		book.displayBookDeatils();
	}
}

// Book class declaration and definition
class Book {
	// Attribute of circle class
	private String name;
	private String author;
	private double price;
	
	// Constructor of the circle class, used for the initialization of the variables
	Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	// Behaviours of the circle class
	public void displayBookDeatils() {
		System.out.println("Book name is " + name + " and it's author name is " + author + " having price of " + price);
	}
}