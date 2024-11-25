package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetThreadSafe {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {

            int val = iterator.next();
            if (val == 11) {
// iterator.remove(); //we can only remove
                set1.add(9); //we should not be able to add in the set as its not thread safe.

                set1.forEach((Integer v) -> System.out.println(v));
            }
        }
    }
}
