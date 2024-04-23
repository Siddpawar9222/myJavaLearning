package L_CollectionFramework.MyMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class D_MapMethods {
    public static void main(String[] args) {
        
        Map<Integer, List<Integer>> adjMap = new HashMap<>();

        //Using anonymous class
        Function<Integer,List<Integer>> function = new Function<>() {
  
          @Override
          public List<Integer> apply(Integer t) {
             return new ArrayList<>(List.of(t)) ;
          }
          
        };
  
         adjMap.put(15, function.apply(56) ) ;
         System.out.println(adjMap);

         //Using lambda function
         adjMap.computeIfAbsent(20, (k)->new ArrayList<>()).add(60);
         adjMap.computeIfAbsent(15, (k)->new ArrayList<>()).add(78);
         System.out.println(adjMap);
    }
}
/*

Function Interface : 
public interface Function<T, R>{
    R apply(T t);
}

You can see apply method takes T datatype parameter and return R datatype parameter .


-The computeIfAbsent(Key, Function) method of HashMap class is used to compute the value for a given key using the given mapping function. Store the computed value for the key in Hashmap if the key is not already associated with a value (or is mapped to null) else null.
-computeIfAbsent return value associted with key.
 */


