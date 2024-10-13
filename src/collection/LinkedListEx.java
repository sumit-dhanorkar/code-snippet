package collection;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //using deque functionality
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);
        System.out.println(list.getFirst());

        //using list functionality
        LinkedList<Integer> list1= new LinkedList<>();
        list1.add(0,100);
        list1.add(1,300);
        list1.add(2,400);
        list1.add(1,200);

        System.out.println(list1.get(1)+" and "+list1.get(2));
    }
}
/*
    Output:
    100
    200 and 300
*/