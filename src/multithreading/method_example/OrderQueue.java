package multithreading.method_example;

import java.util.LinkedList;
import java.util.Queue;

// Shared resource representing the order queue
class OrderQueue {
    private Queue<String> orders = new LinkedList<>();

    // Method for waiters to place an order
    public synchronized void placeOrder(String order) {
        orders.offer(order);
        System.out.println(Thread.currentThread().getName() + " placed order: " + order);
        // Notify waiting chef that an order is available
        notify();
    }

    // Method for chef to retrieve an order; waits if none available
    public synchronized String getOrder() throws InterruptedException {
        while (orders.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + " is waiting for orders...");
            wait();  // Chef waits until notified that an order has been placed
        }
        return orders.poll();
    }
}
