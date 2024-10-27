package collection;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ThreadSafeArrayDQ {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedDeque<Integer> arrayDeque = new ConcurrentLinkedDeque<>();

        new Thread(()-> arrayDeque.addFirst(1)).start();
        new Thread(()-> arrayDeque.addFirst(2)).start();
        new Thread(()-> arrayDeque.addFirst(3)).start();

        Thread.sleep(100);
        while(!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.removeFirst());
        }
    }
}
