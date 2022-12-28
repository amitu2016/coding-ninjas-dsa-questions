package hashmap;

import java.util.HashMap;

public class SubarraySumTo0 {
	
	public static boolean subarraySumTo0(int[] input) {
		int sum = 0;
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
			if (input[i] == 0 || sum == 0 || map.containsKey(sum)) {
				return true;
			}
			
			map.put(sum, false);
		}		
		
		return false;
	}

	public static void main(String[] args) {
		int input[] = {-6, 7, 6, 2, 1};
		
		boolean result = subarraySumTo0(input);
		
		System.out.println(result);

	}

}
