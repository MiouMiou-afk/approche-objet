package map;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		// Création map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>(map1);
		  map2.forEach(
		            (key, value)
		                -> map3.merge(
		                    key,
		                    value,
		                    (v1, v2)
		                        -> v1.equalsIgnoreCase(v2)
		                               ? v1
		                               : v1 + ", " + v2));		
		  
		  System.out.println(map3.size());
		

	}

}
