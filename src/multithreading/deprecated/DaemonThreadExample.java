package multithreading.deprecated;

class DaemonThreadExample extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample daemonThread = new DaemonThreadExample();
        daemonThread.setDaemon(true); // Setting as daemon thread
        daemonThread.start();

        System.out.println("Main thread running...");
        try {
            Thread.sleep(3000); // Main thread runs for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting...");
    }
}

/*
Output:
    Main thread running...
    Daemon thread running...
    Daemon thread running...
    Daemon thread running...
    Main thread exiting...
 */