package multithreading.lock.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;


    public void producer(ReentrantLock lock){
        try {
            lock.lock();
            System.out.println("Lock acquired by :: "+ Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception e){
            //handle exception
        }finally {
            lock.unlock();
            System.out.println("Lock released by :: "+Thread.currentThread().getName());
        }
    }
}
