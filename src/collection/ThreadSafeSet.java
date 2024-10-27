package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeSet {
    public static void main(String[] args) {

        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap<>();
        /*
            here this newKeySet() returns the new thread safe set
         */
        Set<Integer> threadSafeSet=concurrentHashMap.newKeySet();
        threadSafeSet.add(1);
        threadSafeSet.add(2);

        /*
            when we are iterating over this Set we can see we are trying to add an element
            suppose we have set [1, 2, 3, 5]
            while iterating we are at 1st index and we are inserting element there.
            if it is not a thread safe it will throw the error.
         */
        Iterator<Integer> iterator=threadSafeSet.iterator();
        while(iterator.hasNext()) {
            int value=iterator.next();
            if (value==1){
                //iterator.remove() //we can remove
                threadSafeSet.add(9); //we should be able to add in the set as it is threadSafe

            }
        }

        threadSafeSet.forEach((Integer val)-> System.out.print(val+" "));

        /*
            1 2 9
         */
    }
}
