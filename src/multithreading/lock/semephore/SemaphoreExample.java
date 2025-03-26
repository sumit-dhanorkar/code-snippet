package multithreading.lock.semephore;


public class SemaphoreExample {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(3); // Only 3 parking slots

        for (int i = 1; i <= 6; i++) { // 6 cars trying to park
            String car = "Car-" + i;
            new Thread(() -> lot.parkCar(car)).start();
        }
    }
}
