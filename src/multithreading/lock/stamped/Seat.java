package multithreading.lock.stamped;

import java.util.concurrent.atomic.AtomicInteger;

// Seat class representing a concert ticket with version control
class Seat {
    private final int seatNumber;
    private SeatStatus status;
    private final AtomicInteger version;
    private String bookedBy;

    // Enum to represent seat status
    public enum SeatStatus {
        AVAILABLE, PENDING, BOOKED
    }

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.status = SeatStatus.AVAILABLE;
        this.version = new AtomicInteger(1);
        this.bookedBy = null;
    }

    // Synchronized method to attempt booking
    public synchronized boolean book(String userName) {
        // Check if seat is available
        if (status != SeatStatus.AVAILABLE) {
            System.out.println(userName + " failed: Seat " + seatNumber + " is not available.");
            return false;
        }

        // Set to pending to simulate booking process
        status = SeatStatus.PENDING;
        
        try {
            // Simulate booking process with some delay
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            status = SeatStatus.AVAILABLE;
            return false;
        }

        // Final booking confirmation
        status = SeatStatus.BOOKED;
        bookedBy = userName;
        version.incrementAndGet();
        
        System.out.println(userName + " successfully booked seat " + seatNumber);
        return true;
    }

    // Getter methods
    public int getSeatNumber() {
        return seatNumber;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public int getVersion() {
        return version.get();
    }

    public String getBookedBy() {
        return bookedBy;
    }
}
