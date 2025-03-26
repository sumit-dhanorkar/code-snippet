package multithreading.lock.stamped;

// Ticket Booking Service to manage seat bookings
class TicketBookingService {
    private final Seat seat;

    public TicketBookingService(Seat seat) {
        this.seat = seat;
    }

    // Method to simulate user booking attempt
    public boolean bookSeat(String userName) {
        int initialVersion = seat.getVersion();
        
        try {
            // Attempt to book the seat
            boolean bookingResult = seat.book(userName);
            
            // Check if booking was successful
            if (!bookingResult) {
                System.out.println(userName + " booking failed. Seat not available.");
                return false;
            }
            
            // Optimistic locking: Verify version hasn't changed
            if (seat.getVersion() != initialVersion) {
                System.out.println(userName + " lost the race. Seat was booked by another user.");
                return false;
            }
            
            return true;
        } catch (Exception e) {
            System.out.println(userName + " encountered an error: " + e.getMessage());
            return false;
        }
    }
}