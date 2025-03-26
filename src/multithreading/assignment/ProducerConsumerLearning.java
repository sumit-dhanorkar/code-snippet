package multithreading.assignment;

public class ProducerConsumerLearning {
    public static void main(String[] args) {

        SharedQueue sharedQueue=new SharedQueue(3);

        //creating the producer thread;
        Thread producerThread=new Thread(()->{
            try {
                for (int i = 1; i <=6; i++) {
                    sharedQueue.produce(i);
                }
            }catch (Exception e){
                //handle exception
            }
        });


        //creating the consumer thread
        Thread consumerThread=new Thread(()->{
            try {
                for (int i = 1; i <=6; i++) {
                    sharedQueue.consume();
                }
            }catch (Exception e){
                //handle exception
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
