package multithreading.lock.semephore;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.concurrent.Semaphore;

public class SharedResource {
    private boolean isAvailable=false;
    private int time=4000;

    Semaphore lock=new Semaphore(2);


    public  void produce(){
        try {
            lock.acquire();
            System.out.println("Lock acquired by :: "+ Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(time+1000);
        }catch (Exception e){
            //exception
        }finally {
            lock.release();
            System.out.println("Lock released by :: "+Thread.currentThread().getName());
        }
    }
}
