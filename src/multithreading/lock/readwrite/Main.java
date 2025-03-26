package multithreading.lock.readwrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        //shared lock
        Thread t1=new Thread(()->{
            resource.producer(readWriteLock);
        });

        //shared lock
        Thread t2=new Thread(()->{
            resource.producer(readWriteLock);
        });

        SharedResource resource1=new SharedResource();
        //exclusive lock
        Thread t3=new Thread(()->{
            resource1.consumer(readWriteLock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Output:
Read lock acquired by :: Thread-1
Read lock acquired by :: Thread-0
Read lock released by :: Thread-1
Read lock released by :: Thread-0
Write lock acquired by :: Thread-2
write lock released by :: Thread-2
 */