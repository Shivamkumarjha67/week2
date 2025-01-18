import java.util.Random;

public class MovieTicketBookingSystem {
	public static void main(String[] args) {
		// Creating the object of MovieTicket class
		MovieTicket ticket = new MovieTicket();
        ticket.bookTicket();
	}
}

class MovieTicket {
	// Attribute of Movie ticket class
	private String movieBooked;
    private int seatNumber;
    private double amount;
    private int numberofSeats = 120;
    private boolean[] seats = new boolean[numberofSeats];
    private int numberOfMovies = 4;
    private String[] moviesName = {"DDLJ", "Shershah", "Pushpa", "RRR", "PKMB"};
    private int[] prices = {250, 350, 375, 275, 69};
 
    // Book ticket method definition
    public void bookTicket() {
        Random random = new Random();

        while(true) {
            int seatNum = random.nextInt(numberofSeats);

            if(!seats[seatNum]) {
                seats[seatNum] = true;
                seatNumber = seatNum;
                break;
            }
        }

        int movieIndex = random.nextInt(numberOfMovies);
        movieBooked = moviesName[movieIndex];
        amount = prices[numberOfMovies];

        System.out.println("Movie booked is: " + movieBooked + " and it costed " + amount + ". Seat number allocated is: " + seatNumber);
    }
}