package L_CollectionFramework.MyMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D_MapMethods {
    public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);

        map.computeIfAbsent("key4", k->(int)Math.pow(10, 5)) ;

        System.out.println(map);

        int value = map.computeIfAbsent("key5", k->(int)Math.pow(10, 5)) ;

        System.out.println(value);

        System.out.println(map);

        Map<Integer,List<Integer>> adjMap = new HashMap<>();

    }
}
/*
-The computeIfAbsent(Key, Function) method of HashMap class is used to compute the value for a given key using the given mapping function. Store the computed value for the key in Hashmap if the key is not already associated with a value (or is mapped to null) else null.
-computeIfAbsent return value associted with key.
 */


