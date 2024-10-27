package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueEx {
    public static void main(String[] args) {
//        ConcurrentLinkedDeque<Integer> dq = new ConcurrentLinkedDeque<>();
//        dq.addFirst(1);
//        dq.addFirst(2);
//
//        System.out.println(dq.removeLast());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        boolean offer = queue.offer(2);

        System.out.println(offer);

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

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(5);
        pq.add(2);
        pq.add(3);


//so this forEach() method iterates over the internal array-based structure of the heap, which doesn't guarantee the order will reflect the priority order (min-heap ordering
        pq.forEach(System.out::println);



    }
}
