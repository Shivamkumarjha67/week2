public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook book1 = new EBook( "Din dugani raat chaugani", "Vishal Chandravanshi", 69);
        book1.getISBNAndTitle();
    }
}

class Book {
    public int isbn;
    protected String title;
    private String author;

    Book(String title, String author, int isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    EBook(String title, String author, int isbn) {
        super(title, author, isbn);
    }

    public void getISBNAndTitle() {
        System.out.println("Title of the book is " + title + " and isbn is " + isbn);
    }
}