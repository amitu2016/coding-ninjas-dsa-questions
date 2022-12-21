package hashmap;

import java.util.HashMap;

public class PairSumTo0 {

	public static int PairSum(int[] input, int size) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			int key = input[i];
			if (map.containsKey(key)) {
				int freq = map.get(key);
				freq++;
				map.put(key, freq);
			} else {
				map.put(key, 1);
			}
		}

		int count = 0;

		for (int i = 0; i < input.length; i++) {
			int x = input[i];

			if (map.containsKey(-x) && x != 0) {
				int n1 = map.get(x);
				int n2 = map.get(-x);

				count = count + (n1 * n2);
				map.put(x, 0);
				map.put(-x, 0);
			}

		}
		
		if (map.containsKey(0)) {
			int val = map.get(0);
			count = count + (val * (val - 1)) / 2;
		}

		return count;
	}

	public static void main(String[] args) {
		int input[] = {2, 1, -2, 2, 3}; 
		int ans = PairSum(input, input.length);
		System.out.println(ans);
	}

}
