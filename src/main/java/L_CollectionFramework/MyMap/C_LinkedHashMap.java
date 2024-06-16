package L_CollectionFramework.MyMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class C_LinkedHashMap {

	public static void main(String[] args) {
		

		Map<String, Integer> lhm = new LinkedHashMap<>();

		lhm.put("Rohit", 45);
		lhm.put("Virat", 18);
		lhm.put("MSD", 7);
		lhm.put(null, null);
		lhm.put("bumrah", 10);
		System.out.println(lhm);

	}

}
