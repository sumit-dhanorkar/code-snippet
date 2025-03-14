package multithreading;

public class MultiThreadingLearning2 extends Thread{

    @Override
    public void run() {
        System.out.println("Code executed by thread::"+ Thread.currentThread().getName());
    }
}
