import java.util.ArrayList;

public class LibraryAndBook {
    public static void main(String[] args) {
        // Creating the library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Creating the book objects
        Book book1 = new Book("XYZ", "Sandeep");
        Book book2 = new Book("PQR", "Vishwa");

        // Adding the book object to the library whole part, but books can independently exists as well.
        library1.addBook(book1);
        library2.addBook(book2);

        // Displaying the added books to the particular library
        System.out.println("Library 1 Books:");
        library1.displayBooks();

        System.out.println("Library 2 Books:");
        library2.displayBooks();
    }
}

// Library class definition as whole part
class Library {
    // List of all book library contains
    private ArrayList<Book> books;

    // Default constructor
    Library() {
        books = new ArrayList<Book>();
    }

    // Method for adding book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

// Book class definition
class Book {
    // Attribute of the book class
    private String title;
    private String author;

    // Paramaterized constructor
    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}