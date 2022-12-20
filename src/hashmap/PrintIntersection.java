package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class PrintIntersection {

	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);


		for (int i = 0; i < arr1.length; i++) {

			int key = arr1[i];

			if (map.containsKey(key)) {
				int freq = map.get(key);
				freq++;
				map.put(key, freq);
			} else {
				map.put(key, 1);
			}

		}
		

		for (int i = 0; i < arr2.length; i++) {
			int key = arr2[i];

			if (map.containsKey(key)) {
				int freq = map.get(key);

				if (freq > 0) {
					System.out.print(key+" ");
					map.put(key, freq - 1);
				}

			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
