package multithreading.lock.stamped;


// Demonstrate concurrent booking
public class ConcertTicketBookingDemo {
    public static void main(String[] args) {
        // Create a seat
        Seat concertSeat = new Seat(42);
        TicketBookingService bookingService = new TicketBookingService(concertSeat);

        // Simulate concurrent booking attempts
        Runnable aliceBooking = () -> {
            bookingService.bookSeat("Alice");
        };

        Runnable bobBooking = () -> {
            bookingService.bookSeat("Bob");
        };

        // Create threads for Alice and Bob
        Thread aliceThread = new Thread(aliceBooking);
        Thread bobThread = new Thread(bobBooking);

        // Start booking attempts
        aliceThread.start();
        bobThread.start();

        try {
            aliceThread.join();
            bobThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final seat status
        System.out.println("\nFinal Seat Status:");
        System.out.println("Seat Number: " + concertSeat.getSeatNumber());
        System.out.println("Status: " + concertSeat.getStatus());
        System.out.println("Booked By: " + concertSeat.getBookedBy());
        System.out.println("Version: " + concertSeat.getVersion());
    }
}