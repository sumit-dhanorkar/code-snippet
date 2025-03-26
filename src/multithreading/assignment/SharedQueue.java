package multithreading.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedQueue( int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception{
        while (sharedBuffer.size() ==bufferSize){
            System.out.println("Buffer is full, producer is waiting for the consumer.");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("Producer :: "+item);

        //notify the consumer now there are item to consume now.
        notify();
    }

    public synchronized int consume() throws Exception{
        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, Consumer is waiting for producer.");
            wait();
        }

        int item=sharedBuffer.poll();
        System.out.println("Consumed :: "+item);
        notify();
        return item;
    }
}
