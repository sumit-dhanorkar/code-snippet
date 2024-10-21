package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> rollNumberVsNameMap = new HashMap<>();
        rollNumberVsNameMap.put(null, "TEST");
        rollNumberVsNameMap.put(0, null);
        rollNumberVsNameMap.put(1, "A");
        rollNumberVsNameMap.put(2, "B");


        //computeIfAbsent
        /*
            if the value is null for a given key so below key is null
            so if key doenst exists or key is null then add this "test" data
            so below our key is null so putIfAbsent check does null exists  as above we have put
            null value as key so here null exists then it cheks does test value exists
            so here value test exists so this will not write data
         */
        rollNumberVsNameMap.putIfAbsent(null,"test");
        /*
            not it will check does zero exists yes as above we put o as key and null as value
            what is value null tso hashmap will override with this value ZERO
         */
        rollNumberVsNameMap.putIfAbsent(0, "ZERO");
        /*
            now does three exist not it will calculate the hash then mode and insert at resulting index
         */
        rollNumberVsNameMap.putIfAbsent(3, "C");

        /*
            we know that in hashmap we have array of Entry<K,V>[] so in below entrySet
            will give us array of Node<K, V> and we are iterating.
         */
        for(Map.Entry<Integer, String> entryMap: rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("KEY: "+key + " " +"VALUE: "+ value);
        }
        /*
            Output:
            KEY: null VALUE: TEST
            KEY: 0 VALUE: ZERO
            KEY: 1 VALUE: A
            KEY: 2 VALUE: B
            KEY: 3 VALUE: C
         */

        //isEmpty
        System.out.println("isEmpty: " + rollNumberVsNameMap.isEmpty()); //isEmpty: false

        //size
        System.out.println("size: " + rollNumberVsNameMap.size()); //size: 5

        //containsKey
        System.out.println("containsKey: " + rollNumberVsNameMap.containsKey(3)); //containsKey: true

        //get(key)
        System.out.println("get(1): " + rollNumberVsNameMap.get(1)); //get(1): A

        //getOrDefault(key)
        System.out.println("getOrDefault(9): " + rollNumberVsNameMap.getOrDefault(9, "default value")); //getOrDefault(9): default value

        //remove(key)""
        System.out.println("removeNull: " + rollNumberVsNameMap.remove(null)); //removeNull: TEST

        for(Map.Entry<Integer, String> entryMap: rollNumberVsNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("KEY: "+key + " " +"VALUE: "+ value);
        }
        /*
            Output:
            KEY: 0 VALUE: ZERO
            KEY: 1 VALUE: A
            KEY: 2 VALUE: B
            KEY: 3 VALUE: C

         */

        //keySet
        for(Integer key: rollNumberVsNameMap.keySet()) {
            System.out.println("KEY: "+key);
        }
        /*
            Output:
            KEY: 0
            KEY: 1
            KEY: 2
            KEY: 3
         */

        //values
        for(String value: rollNumberVsNameMap.values()) {
            System.out.println("VALUE: "+value);
        }
        /*
            Output:
            VALUE: ZERO
            VALUE: A
            VALUE: B
            VALUE: C
         */
    }
}
