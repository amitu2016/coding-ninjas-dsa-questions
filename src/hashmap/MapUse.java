package hashmap;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("amit", 1);
		map.put("sumit", 2);
		map.put("amit1", 3);
		map.put("sumit1", 4);
		
		if (map.containsKey("amit")) {
			System.out.println("contains amit");
		}
		
		
		int v = 0;
		if (map.containsKey("amit1")) {
			v = map.get("amit1");
		}
		//System.out.println(v);
		
		//Iterate
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(map.get(key)); 
		}

	}

}
