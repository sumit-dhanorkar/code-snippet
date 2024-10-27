package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        //union of two set
        set1.addAll(set2);
        System.out.println("After union:");
        set1.forEach(s->System.out.print(" "+s));
        /*
            After union:
            33 4 5 88 9 10 11 12
         */

        //intersection of two set
        set1=new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2=new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.retainAll(set2);
        System.out.println("After intersection:");
        set1.forEach(s->System.out.print(" "+s));
        /*
            After intersection:
            11 12
         */

        //Difference of 2 set
        set1=new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2=new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        System.out.println("After Difference:");
        set1.removeAll(set2);
        set1.forEach(s->System.out.print(" "+s));
        /*
           After Difference:
           33 4
         */


    }


}
