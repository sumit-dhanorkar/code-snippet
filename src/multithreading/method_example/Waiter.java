package multithreading.method_example;

// Waiter thread: places orders into the queue
class Waiter extends Thread {
    private OrderQueue orderQueue;
    private String[] orders;

    public Waiter(OrderQueue orderQueue, String[] orders, String name) {
        super(name);
        this.orderQueue = orderQueue;
        this.orders = orders;
    }

    public void run() {
        for (String order : orders) {
            orderQueue.placeOrder(order);
            // Yield to give other threads (like the Chef) a chance to run
            Thread.yield();
            try {
                // Simulate a short break between taking orders
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
