package multithreading.method_example;

// Chef thread: processes orders from the queue
class Chef extends Thread {
    private OrderQueue orderQueue;
    private volatile boolean running = true;

    public Chef(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void run() {
        while (running) {
            try {
                // Retrieve an order; chef waits here if no orders are present
                String order = orderQueue.getOrder();
                System.out.println("Chef is preparing: " + order);
                // Simulate time taken to prepare the order
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Chef is interrupted.");
                break;
            }
        }
        System.out.println("Chef has finished for the day.");
    }

    // Stop the chef gracefully
    public void stopChef() {
        running = false;
        // Wake up the chef in case he is waiting for an order
        synchronized(orderQueue) {
            orderQueue.notify();
        }
    }
}
