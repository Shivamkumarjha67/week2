public class LibraryBookingSystem {
    public static void main(String[] args) {
        BookDetails book1 = new BookDetails("Play with numbers", "S.Chand", 249, 9);
        book1.borrowBook();
    }
}

class BookDetails {
    private String title;
    private String author;
    private int price;
    private int availability;

    // Parameterized constructor
    BookDetails(String name, String author, int price, int numbers) {
        this.title = name;
        this.author = author;
        this.price = price;
        this.availability = numbers;
    }

    // Method for borrowing the book from library based on it's availability
    public void borrowBook() {
        if(availability <= 0) {
            System.out.println("Sorry book is not available!");
            return;
        }

        System.out.println(title + " book access granted.");
        availability -= 1;
    }
}