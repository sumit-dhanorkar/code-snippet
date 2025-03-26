package multithreading;

public class Main  {
    public static void main(String[] args) {
        System.out.println("main method start::");
        SharedResource sharedResource=new SharedResource();
        //producer thread
        Thread producerThread=new Thread(new ProduceTask(sharedResource));
        //consumer thread
        Thread consumerThread=new Thread(new ConsumeTask(sharedResource));
        //thread is in runnable state.
        producerThread.start();
        consumerThread.start();
        System.out.println("main method end::");
    }

}

