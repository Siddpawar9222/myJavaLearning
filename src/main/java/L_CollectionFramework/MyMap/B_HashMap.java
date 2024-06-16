package L_CollectionFramework.MyMap;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class B_HashMap {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();

		hm.put("Rohit", 45);
		hm.put("Virat", 18);
		hm.put("MSD", 7);
		hm.put(null, null);
		hm.put("bumrah", 10);
		System.out.println(hm);

	}

}
/*
Difference between HashMap and HashSet 
https://www.javatpoint.com/difference-between-hashset-and-hashmap
*/