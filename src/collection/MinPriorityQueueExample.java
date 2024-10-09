package collection;

import java.util.PriorityQueue;

public class MinPriorityQueueExample {
    public static void main(String[] args) {
        //min priority queue, used to solve problem of max heap.
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
/*
    OutPut:
    8
    2
    5
    1
    remove from top: 8
    remove from top: 5
    remove from top: 2
    remove from top: 1

 */