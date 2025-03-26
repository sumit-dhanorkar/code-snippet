package multithreading;

public class MonitorLockExample{

    public synchronized void task1(){
        try {
            System.out.println("Inside task1!");
            Thread.sleep(10000);
        }catch (Exception e){
            //exception
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronised");
        synchronized (this){
            System.out.println("task2, inside synchronised ");
        }
    }

    public void task3(){
        System.out.println("task3");
    }
}


