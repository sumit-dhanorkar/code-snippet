package multithreading.method_example;

// Main class to run the restaurant simulation
public class RestaurantSimulation {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue();

        // Create and start the Chef thread
        Chef chef = new Chef(orderQueue);
        chef.start();

        // Create and start two Waiter threads
        Waiter waiter1 = new Waiter(orderQueue, new String[]{"Burger", "Fries"}, "Waiter-1");
        Waiter waiter2 = new Waiter(orderQueue, new String[]{"Pizza", "Salad"}, "Waiter-2");

        waiter1.start();
        waiter2.start();

        // Main thread waits for both waiters to finish placing orders
        try {
            waiter1.join();
            waiter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Once waiters are done, stop the Chef and wait for him to finish
        chef.stopChef();
        chef.interrupt();
        try {
            chef.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Restaurant is closed for the day.");
    }
}
