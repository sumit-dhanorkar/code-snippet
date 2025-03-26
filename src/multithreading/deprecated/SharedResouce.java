package multithreading.deprecated;

public class SharedResouce {
    boolean isAvailable=false;

    public synchronized void produce(){
        System.out.println("lock acquired ");
        isAvailable=true;
        try {
            Thread.sleep(8000);
        }catch (Exception e){
            //handle exception
        }
        System.out.println("lock released");
    }
}
