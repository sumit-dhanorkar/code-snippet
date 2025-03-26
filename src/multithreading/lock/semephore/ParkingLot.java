package multithreading.lock.semephore;

import java.util.concurrent.Semaphore;

class ParkingLot {
    private Semaphore semaphore;

    public ParkingLot(int slots) {
        this.semaphore = new Semaphore(slots); // 3 slots available
    }

    void parkCar(String car) {
        try {
            System.out.println(car + " trying to park...");
            semaphore.acquire(); // Acquire a parking spot
            System.out.println(car + " parked.");
            Thread.sleep(2000); // Simulate parking time
            System.out.println(car + " leaving...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the spot
        }
    }
}
