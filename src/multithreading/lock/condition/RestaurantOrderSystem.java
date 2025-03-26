package multithreading.lock.condition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class RestaurantOrderSystem {
    // Shared resource: Order Queue
    private final Queue<Order> orderQueue = new LinkedList<>();
    
    // Maximum capacity of the order queue
    private static final int MAX_CAPACITY = 5;
    
    // Reentrant lock for thread-safe operations
    private final ReentrantLock lock = new ReentrantLock();
    
    // Conditions for production and consumption
    private final Condition orderAvailable = lock.newCondition();
    private final Condition orderSpaceAvailable = lock.newCondition();

    // Order class to represent restaurant orders
    private static class Order {
        private final int orderId;
        private final String customerName;

        public Order(int orderId, String customerName) {
            this.orderId = orderId;
            this.customerName = customerName;
        }

        @Override
        public String toString() {
            return "Order{id=" + orderId + ", customer='" + customerName + "'}";
        }
    }

    // Waiter (Producer) method to place orders
    public void placeOrder(Order order) throws InterruptedException {
        lock.lock();
        try {
            // Wait if the order queue is full
            while (orderQueue.size() == MAX_CAPACITY) {
                System.out.println("Kitchen is at full capacity. Waiter " + 
                    Thread.currentThread().getName() + " is waiting.");
                orderSpaceAvailable.await();
            }

            // Add order to the queue
            orderQueue.offer(order);
            System.out.println("Waiter " + Thread.currentThread().getName() + 
                " placed " + order);

            // Signal that an order is available for cooking
            orderAvailable.signal();
        } finally {
            lock.unlock();
        }
    }

    // Chef (Consumer) method to prepare orders
    public Order prepareOrder() throws InterruptedException {
        lock.lock();
        try {
            // Wait if no orders are available
            while (orderQueue.isEmpty()) {
                System.out.println("Chef " + Thread.currentThread().getName() + 
                    " is waiting for orders.");
                orderAvailable.await();
            }

            // Remove and prepare the order
            Order order = orderQueue.poll();
            System.out.println("Chef " + Thread.currentThread().getName() + 
                " is preparing " + order);

            // Signal that space is now available in the order queue
            orderSpaceAvailable.signal();

            return order;
        } finally {
            lock.unlock();
        }
    }

    // Demonstration of the Restaurant Order System
    public static void main(String[] args) {
        RestaurantOrderSystem orderSystem = new RestaurantOrderSystem();

        // Waiter Threads (Producers)
        Runnable waiterTask = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    Order order = new Order(i, "Customer-" + i);
                    orderSystem.placeOrder(order);
                    Thread.sleep(500); // Simulate time between taking orders
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Chef Threads (Consumers)
        Runnable chefTask = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    Order order = orderSystem.prepareOrder();
                    Thread.sleep(1000); // Simulate cooking time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Create and start waiter and chef threads
        Thread waiter1 = new Thread(waiterTask, "Waiter-1");
        Thread waiter2 = new Thread(waiterTask, "Waiter-2");
        Thread chef1 = new Thread(chefTask, "Chef-1");
        Thread chef2 = new Thread(chefTask, "Chef-2");

        waiter1.start();
        waiter2.start();
        chef1.start();
        chef2.start();
    }
}