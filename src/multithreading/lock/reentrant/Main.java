package multithreading.lock.reentrant;


import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        SharedResource resource1=new SharedResource();
        Thread t1=new Thread(()->{
            resource1.producer(lock);
        });

        Thread t2=new Thread(()->{
            resource1.producer(lock);
        });

        SharedResource resource2 = new SharedResource();
        Thread t3=new Thread(()->{
            resource2.producer(lock);
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
/*
    Output:
    Lock acquired by :: Thread-0
    Lock acquired by :: Thread-1
    Lock released by :: Thread-0
    Lock released by :: Thread-1
    Lock acquired by :: Thread-2
    Lock released by :: Thread-2
 */