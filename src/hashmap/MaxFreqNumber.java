package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxFreqNumber {
	
	 public static int maxFrequencyNumber(int[] arr){ 
			HashMap<Integer, Integer> map = new HashMap<>();
			
			
			
			for (int i = 0; i < arr.length; i++) {
				int key = arr[i];
				if (map.containsKey(key)) {
					int freq = map.get(key);
					freq++;
					map.put(key, freq);
				}else {
					map.put(key, 1);
				}
				
			}
			
			
			
			
			int max = 0, res = Integer.MIN_VALUE;
			
			for(Entry<Integer, Integer> val : map.entrySet()) {
				if(max < val.getValue()) {
					res = val.getKey();
					max = val.getValue();
				}
			}
			
			return res;
			
	    }

	public static void main(String[] args) {
		int arr[] = {2, 12, 2, 11, 12, 2, 1, 2 ,2 ,11, 12, 2 ,6 };
		int ans = maxFrequencyNumber(arr);
		System.out.println(ans);
	}

}
