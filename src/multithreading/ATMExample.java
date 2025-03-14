package multithreading;

class ATM {
    private boolean hasCash = false; // ATM initially has no cash

    public synchronized void useATM(String name) {
        System.out.println(name + " is trying to access ATM.");
        try {
            Thread.sleep(3000); // Simulating ATM use
            System.out.println(name + " has completed the transaction.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public synchronized void withdrawCash(String name) throws InterruptedException {
        while (!hasCash) { // If ATM has no cash, wait
            System.out.println(name + " is waiting for cash refill.");
            wait();
        }
        System.out.println(name + " withdraws cash.");
    }

    public synchronized void refillCash() {
        System.out.println("ATM is being refilled...");
        hasCash = true;
        notifyAll(); // Notify all waiting threads
    }
}

public class ATMExample {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // 3 threads trying to access ATM (Blocked State)
        Thread t1 = new Thread(() -> atm.useATM("Customer 1"));
        Thread t2 = new Thread(() -> atm.useATM("Customer 2"));
        Thread t3 = new Thread(() -> atm.useATM("Customer 3"));

        // 2 threads waiting for ATM cash refill (Waiting State)
        Thread t4 = new Thread(() -> {
            try {
                atm.withdrawCash("Customer 4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t5 = new Thread(() -> {
            try {
                atm.withdrawCash("Customer 5");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Refill ATM cash after some time
        Thread bankStaff = new Thread(() -> {
            try {
                Thread.sleep(5000);
                atm.refillCash();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        bankStaff.start();
    }
}
