package collection;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class ThreadSafePriorityBQ {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();

        new Thread(() -> pbq.add(4)).start();
        new Thread(() -> pbq.add(6)).start();
        new Thread(() -> pbq.add(2)).start();

        Thread.sleep(1000);

        while (!pbq.isEmpty()) {
            Integer el = pbq.poll();
            System.out.println(el);
        }
    }
}

