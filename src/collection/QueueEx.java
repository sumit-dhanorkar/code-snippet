package collection;

import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueEx {
    public static void main(String[] args) {
//        ConcurrentLinkedDeque<Integer> dq = new ConcurrentLinkedDeque<>();
//        dq.addFirst(1);
//        dq.addFirst(2);
//
//        System.out.println(dq.removeLast());


        PriorityQueue<Integer> minPQ = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);


        //lets print all the values
        minPQ.forEach((Integer val) -> System.out.println(val));


        //remove top element from the PQ and print
        while (!minPQ.isEmpty()) {
            int val = minPQ.poll();
            System.out.println("remove from top: "+val);
        }




    }
}
