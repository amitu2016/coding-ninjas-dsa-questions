package hashmap;

import java.util.ArrayList;

public class Map<K, V> {
	
	ArrayList<MapNode<K, V>> buckets;
	int size;
	int numBuckets;
	
	public Map() {
		numBuckets = 20;
		buckets = new ArrayList<>();
		
		for (int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return hashCode % numBuckets;
	}
	
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			
			head = head.next;
		}
		
		head = buckets.get(bucketIndex);
		MapNode<K, V> newMapNode = new MapNode<K, V>(key, value);
		newMapNode.next = head;
		buckets.set(bucketIndex, newMapNode);
	}
	
}
