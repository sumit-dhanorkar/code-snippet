package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<Integer> intSet = new LinkedHashSet<Integer>();
        intSet.add(1);
        intSet.add(22);
        intSet.add(31);
        intSet.add(42);

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element+" ");
        }

        /*
            Output:
            1 22 31 42  -> insertion order is maintained
         */

    }
}
