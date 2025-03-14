package multithreading;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Going inside main method::"+Thread.currentThread().getName());
        MultiThreadingLearning2 multiThreadingLearning=new MultiThreadingLearning2();
        multiThreadingLearning.start();
        System.out.println("Finished main method::"+Thread.currentThread().getName());

    }

}

