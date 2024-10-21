package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

// Assuming these keys have hash collisions and fall into the same bucket
        map.put("A", 1);  // Linked List: A -> null
        map.put("B", 2);  // Linked List: A -> B -> null
        map.put("C", 3);  // Linked List: A -> B -> C -> null
        map.put("D", 4);  // Linked List: A -> B -> C -> D -> null
        map.put("E", 5);  // Linked List: A -> B -> C -> D -> E -> null
        map.put("F", 6);  // Linked List: A -> B -> C -> D -> E -> F -> null
        map.put("G", 7);  // Linked List: A -> B -> C -> D -> E -> F -> G -> null
        map.put("H", 8);  // Linked List: A -> B -> C -> D -> E -> F -> G -> H -> null

// Now the treeify threshold (8) is reached, so the linked list will be treeified
        map.put("I", 9);  // Converts linked list to Red-Black Tree


        /*
                 D
               /   \
              B     F
             / \   / \
            A   C E   G
                       \
                        H
         */




    }



}
