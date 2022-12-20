package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] a){
		ArrayList<Integer> output = new ArrayList<>();
		
		HashMap<Integer, Boolean> seen = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			if (seen.containsKey(a[i])) {
				continue;
			}
			output.add(a[i]);
			seen.put(a[i], true);
			
		}
		return output;
	} 

	public static void main(String[] args) {
		
		int a[] = {5,1,3,1,5,2,5,1000,3,6}; 
		ArrayList<Integer> out = removeDuplicates(a);
		
		for(Integer o : out) {
			System.out.println(o);
		}
		
	}

}
