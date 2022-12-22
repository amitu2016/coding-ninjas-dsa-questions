package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveIncreasingSubsequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		HashMap<Integer, Integer> lenMap = new HashMap<>();

		// Initilizing map
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}

		int maxLen = 0, maxStart = -1;

		for (int i : arr) {

			if (map.get(i)) {

				int currStart = i, currLen = 1;
				boolean flag = true;

				map.put(i, false);

				int ahead = i + 1;

				while (flag) {
					if (map.containsKey(ahead)) {
						currLen = currLen + 1;
						map.put(ahead, false);
						ahead = ahead + 1;
					} else {
						flag = false;
					}
				}

				flag = true;

				int before = i - 1;

				while (flag) {

					if (map.containsKey(before)) {
						currLen = currLen + 1;
						currStart = before;
						map.put(before, false);
						before = before - 1;
					} else {
						flag = false;
					}

				}

				if (currLen > maxLen) {
					maxLen = currLen;
					maxStart = currStart;
					lenMap.put(maxStart, maxLen);
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i]) >= maxLen) {
				maxStart = arr[i];
				maxLen = lenMap.get(arr[i]);
				break;
			}
		}

		output.add(maxStart);
		output.add(maxStart + maxLen - 1);
		return output;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
		ArrayList<Integer> output = longestConsecutiveIncreasingSequence(arr);
		
		for(int out : output) {
			System.out.print(out+" ");
		}
	}

}
