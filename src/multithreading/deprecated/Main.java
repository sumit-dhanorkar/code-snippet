package multithreading.deprecated;

public class Main {
    public static void main(String[] args) {
        SharedResouce sharedResouce=new SharedResouce();

        System.out.println("main thread started");
        Thread t1=new Thread(()->{
            try {
                System.out.println("Thread 1 calling produce method");
                sharedResouce.produce();
            }catch (Exception e){
                //handle excpetion
            }
        });


        Thread t2=new Thread(()->{
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                //handle excpetion
            }
            System.out.println("Thread 2 calling produce method");
            sharedResouce.produce();
        });

        t1.start();
        t2.start();


        try {
            Thread.sleep(3000);
        }catch (Exception e){
            //handle excpetion
        }
        System.out.println("Thread 1 is suspend.");

        t1.suspend();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            //handle excpetion
        }
        t1.resume();
        System.out.println("Main thread finished");
    }
}
