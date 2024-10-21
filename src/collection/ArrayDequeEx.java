package collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        // Queue (FIFO: First In First Out)
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addLast(1);  // Enqueue element at the rear
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);
        
        // Printing elements (FIFO order)
        arrayDequeAsQueue.forEach(item -> System.out.print(item + " "));  // Output: 1 5 10 
        System.out.println();
        
        // Dequeue (remove element from the front)
        int element1 = arrayDequeAsQueue.removeFirst();
        System.out.println("Dequeued: " + element1);  // Output: 1

        // Stack (LIFO: Last In First Out)
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);  // Push element onto the stack (add to the front)
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);

        // Printing elements (LIFO order)
        arrayDequeAsStack.forEach(item -> System.out.print(item + " "));  // Output: 10 5 1
        System.out.println();
        
        // Pop (remove element from the top)
        int element2 = arrayDequeAsStack.removeFirst();  // LIFO behavior, removing from the front
        System.out.println("Popped: " + element2);  // Output: 10
    }
}
/*
    Output:
    1 5 10
    Dequeued: 1
    10 5 1
    Popped: 10
 */