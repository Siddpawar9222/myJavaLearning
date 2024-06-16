package L_CollectionFramework.JavaCursors;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapTraversal {

	public static void main(String[] args) {

		Map<String, Integer> tm = new TreeMap<>();
		tm.put("Rohit", 45);
		tm.put("Virat", 18);
		tm.put("MSD", 7);
		// tm.put(null, null);


		//Using forEach
		System.out.println("Using forEach");
		Set<Entry<String, Integer>> entries = tm.entrySet();
		for (Entry<String,Integer> entry : entries) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key+ " ----> " + value);
		}


		// Using Iterator
		System.out.println("Using Iterator");
		Set<Map.Entry<String, Integer>> set = tm.entrySet();
		Iterator<Map.Entry<String, Integer>> i = set.iterator();

//		while (i.hasNext()) {
//			Map.Entry<String, Integer> map = i.next();
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println(key + " " + value);
//		}

		
		// since java 8, i have forEach Method
		System.out.println("forEach Method");
		tm.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
