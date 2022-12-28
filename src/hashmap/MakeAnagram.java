package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class MakeAnagram {

	public static int makeAnagram(String s1, String s2) {
		char charArr1[] = s1.toCharArray();
		char charArr2[] = s2.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < charArr1.length; i++) {
			char c1 = charArr1[i];
			
			if (map.containsKey(c1)) {
				int freq = map.get(c1);
				freq = freq + 1;
				map.put(c1, freq);
			} else {
				map.put(c1, 1);
			}
		}
		
		for (int i = 0; i < charArr2.length; i++) {
			char c2 = charArr2[i];
			
			if (map.containsKey(c2)) {
				int freq = map.get(c2);
				freq = freq - 1;
				map.put(c2, freq);
			} else {
				map.put(c2, 1);
			}
		}
		
		int count = 0;
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			Integer val = entry.getValue();
			
			if (val > 0) {
				count ++;
			}
			
		}
		
		return count;

	}

	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "aba";
		
		int result = makeAnagram(s1, s2);
		
		System.out.println(result);

	}

}
