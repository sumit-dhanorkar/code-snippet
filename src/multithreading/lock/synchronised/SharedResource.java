package multithreading.lock.synchronised;

public class SharedResource {

    boolean isAvailable=false;

    public synchronized void producer(){
        try {
            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception e){
            //handle exception
        }

        System.out.println("Lock released by: "+Thread.currentThread().getName());
    }
}
