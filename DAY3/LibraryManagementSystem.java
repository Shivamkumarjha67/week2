public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("XYZ", "Sandeep", 34432);
        System.out.println("book1 is the object of the class Book: " + (book1 instanceof Book));
        book1.displayDetails();
    }
}

class Book {
    // Static varibles and methods
    static String libraryName = "VidyaPeeth";
    static void displayLibraryName() {
        System.out.println("Name of the library is: " + libraryName);
    }

    private String title;
    private String author;
    private final int isbn;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title of the book is " + title + " and author of the book is " + author + ". It's isbn number is " + isbn);
    }
}