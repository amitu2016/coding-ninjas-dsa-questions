package hashmap;

import java.util.HashMap;

public class PairWithDifferenceK {
	

	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (map.containsKey(key)) {
				int freq = map.get(key);
				freq = freq + 1;
				map.put(key, freq);
			}else {
				map.put(key, 1);
			}
		}
		
		
		int count = 0;
		
		
        if (k==0)
        {
            for (Integer i: map.keySet())
        	{
                int val=map.get(i);
            	count=count+(val*(val-1))/2;
        	}
            return count;
        }
        
        for(Integer i: map.keySet()) {
        	if (map.containsKey(k + i)) {
        		int num1 = map.get(i);
				int num2 = map.get(i + k);
				count = count + (num1 * num2);
			}
        	
        	if (map.containsKey(i - k)) {
        		int num1 = map.get(i);
				int num2 = map.get(i - k);	
				count = count + (num1 * num2);
			}
        }
		

		count = count / 2;
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
