package collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {


        /*
            if we see below order is done based on the comparator which is sort in desc order
         */
        Map<Integer, String> map1 = new TreeMap<Integer, String>((Integer key1, Integer key2) -> key2-key1);
        map1.put(21, "SJ");
        map1.put(11, "PJ");
        map1.put(13, "KJ");
        map1.put(5, "TJ");

        //decreasing order:
        map1.forEach((Integer key, String value)-> System.out.println(key + " : " + value));
        /*
            Output:
            21 : SJ
            13 : KJ
            11 : PJ
            5 : TJ
         */
        System.out.println("---------------------------");

        Map<Integer,String > map2=new TreeMap<>();
        map2.put(21, "SJ");
        map2.put(11, "PJ");
        map2.put(13, "KJ");
        map2.put(5, "TJ");

        //increasing order
        map2.forEach((Integer key, String value)-> System.out.println(key + " : " + value));
        /*
            Output:
            5 : TJ
            11 : PJ
            13 : KJ
            21 : SJ
         */
    }
}


