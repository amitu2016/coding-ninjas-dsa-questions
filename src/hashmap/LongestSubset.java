package hashmap;

import java.util.HashMap;

public class LongestSubset {

	public static int max(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;

		int max_len = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if(sum == 0) {
				max_len = 1 + i;
			}
			
			
			if (map.containsKey(sum)) {
				if (max_len < i - map.get(sum)) {
					max_len = i - map.get(sum);
				}
			} else {
				map.put(sum, i);
			}
			
		}
		
		return max_len;

	}

	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 0, 0};
		System.out.println(max(arr));
	}

}
