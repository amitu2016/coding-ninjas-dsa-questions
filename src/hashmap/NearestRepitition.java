package hashmap;

import java.util.HashMap;

public class NearestRepitition {

	public static int minDistance(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int min_dist = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			
			if (map.containsKey(key)) {
				min_dist = Math.min(min_dist, i - map.get(key));
			}else {
				map.put(key, i);
			}
		}
		
		return min_dist;
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 47, 82, 4, 4, 6, 2};
		System.out.println(minDistance(arr));
	}

}
