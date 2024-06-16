package G_OOPS.ReferenceVariable;

import java.util.HashMap;
import java.util.Map;

public class B_WithCollections {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(Map.of("virat", 18, "rohit", 45));
        System.out.println("Before Changing....");
        System.out.println("Map1 " + map1);
        Map<String, Integer> map2 = map1;
        System.out.println("Map2 " + map2);

        System.out.println("After Changing....");
        map2.put("rohit", 90);
        System.out.println("Map1 " + map1);
        System.out.println("Map2 " + map2);

        
        map1.put("Virat", 8888);

        System.out.println("Map1 " + map1);
        System.out.println("Map2 " + map2);
        
        // System.out.println("Before Assignment....");
        // map2 = new HashMap<>(Map.of("jasprit", 13, "shami", 50));
        // System.out.println("Map1 " + map1);
        // System.out.println("Map2 " + map2);

    }
}
