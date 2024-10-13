package collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);

        //deletion
        int element1 =arrayDequeAsQueue.removeFirst();
        System.out.println(element1);

        //LIFO Fast In First Out

        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addLast(1);
        arrayDequeAsStack.addLast(5);
        arrayDequeAsStack.addLast(10);

        int element2 = arrayDequeAsStack.removeFirst();
        System.out.println(element2);
    }
}
