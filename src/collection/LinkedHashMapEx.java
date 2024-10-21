package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        System.out.println("Below is LinkedHashMap output: ");
        Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");

        //accessing some data
        map.get(23);
        map.forEach((Integer key,String value)-> System.out.println(key+" : "+value));

        Map<Integer, String> map2 = Collections.synchronizedMap(new LinkedHashMap<>());
        //        /*
//            if we see the below output ordering is maintained
//            Output:
//            Below is LinkedHashMap output:
//                1 : A
//                21 : B
//                23 : C
//                141 : D
//                25 : E
//         */
//
//        map.forEach((Integer key, String value) -> System.out.println(key+" : "+value));
//
//        System.out.println("Below is normal HashMap output: ");
//        Map<Integer, String> normalMap = new HashMap<>();
//        normalMap.put(1, "A");
//        normalMap.put(21, "B");
//        normalMap.put(23, "C");
//        normalMap.put(141, "D");
//        normalMap.put(25, "E");
//        /*
//            if we see the below output ordering not maintained
//            Below is normal HashMap output:
//            1 : A
//            21 : B
//            23 : C
//            25 : E
//            141 : D
//         */
//        for (Map.Entry<Integer, String> entry : normalMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//

    }
}


