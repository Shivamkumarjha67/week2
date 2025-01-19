public class HotelBookingSystem {
    public static void main(String[] args) {
        // Previous status of the booking
        System.out.println("Initial status of bookings: ");
        HotelBooking booking1 = new HotelBooking();
        booking1.bookingDetails();

        // New booking recorded
        System.out.println("Booking 2 details: ");
        HotelBooking booking2 = new HotelBooking("Shivam", "AC", 4);
        booking2.bookingDetails();

        // Passing the already booked object details by copy constructor
        System.out.println("Booking 3 details: ");
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.bookingDetails();
    }
}

class HotelBooking {
    // Attributes of the HotelBooking
    private String guestName;
    private String roomType;
    private int nights;

    // default constructor
    HotelBooking() {
        guestName = "Owner";
        roomType = "AC";
        nights = 30;
    }

    // Parameterized Constructor
    HotelBooking(String name, String type, int night) {
        guestName = name;
        roomType = type;
        nights = night;
    }

    // Copy Constructor
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Displaying detail of booking
    public void bookingDetails() {
        System.out.println("Guest name is: " + guestName + " and his room type is " + roomType + " and he is staying for " + nights + " nights.");
    }
}
