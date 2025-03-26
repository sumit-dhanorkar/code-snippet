package multithreading.lock.synchronised;

public class Main {
    public static void main(String[] args) {
        SharedResource resource1=new SharedResource();
        Thread t1=new Thread(()->{
            resource1.producer();
        });

        SharedResource resource2 = new SharedResource();
        Thread t2=new Thread(()->{
            resource2.producer();
        });

        t1.start();
        t2.start();

    }
}
/*
    Output:
    Lock acquired by: Thread-1
    Lock acquired by: Thread-0
    Lock released by: Thread-1
    Lock released by: Thread-0
 */