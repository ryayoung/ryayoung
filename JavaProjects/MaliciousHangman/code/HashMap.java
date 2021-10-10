package project4;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> implements Map<K, V> {
	
	// List of primes to be used for p value in the MAD compression method
	private final int[] primes = {100663319, 201326611, 402653189, 805306457, 1610612741};
	
	// Data members
	private LinkedList<Entry<K, V>>[] buckets;
	private int numEntries;
	
	// Parameters for Multiply-Add-Divide compression
	// Hash function = ((hashCode() * a + b) % p) % n
	private int p;
	private int a;
	private int b;
	
	public HashMap() {
		initMap(16);
	}
	
	private void initMap(int bucketCount) {

		// Init the array
		this.buckets = new LinkedList[bucketCount];
		this.numEntries = 0;
		
		// Init the linked lists (buckets)
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
		
		// Init MAD param
		this.p = primes[(int) (Math.random() * primes.length)];
		this.a = (int)(Math.random() * (p-1) + 1);
		this.b = (int)(Math.random() * p);
		
	}
	
	private int hashFunction(K key) {
		return (Math.abs(key.hashCode() * a + b) % p) % this.buckets.length;
	}
	
	//Map methods
	@Override
	public int size() {
		return numEntries;
	}

	@Override
	public boolean isEmpty() {
		return numEntries == 0;
	}

	@Override
	public V get(K k) {
		LinkedList<Entry<K, V>> bucket = buckets[hashFunction(k)];
		for (Entry<K, V> e : bucket)
			if (e.getKey().equals(k))
				return e.getValue();
		
		return null;
	}

	@Override
	public V put(K k, V v) {
		expandIfNeeded();
		int index = hashFunction(k);
		LinkedList<Entry<K, V>> bucket = buckets[index];
		for (Entry<K, V> e : bucket) 
			if (e.getKey().equals(k))
				return e.setValue(v);
		
		// k is not in the map
		bucket.addFirst(new MapEntry(k, v));
		numEntries++;
		return null;
	}

	@Override
	public V remove(K key) {
		LinkedList<Entry<K, V>> bucket = buckets[hashFunction(key)];
		
		for (Entry<K, V> entry : bucket) {
			if (entry.getKey().equals(key))
				numEntries--;
				V valueToReturn = entry.getValue();
				bucket.remove(entry);
				return valueToReturn;
		}
		return null;
	}

	@Override
	public Iterable<K> keySet() {
		ArrayList<K> keys = new ArrayList<>();
		for (LinkedList<Entry<K, V>> bucket : buckets)
			for (Entry<K, V> e : bucket)
				keys.add(e.getKey());

		return keys;
	}

	@Override
	public Iterable<V> values() {
		ArrayList<V> values = new ArrayList<>();
		for (LinkedList<Entry<K, V>> bucket : buckets)
			for (Entry<K, V> e : bucket)
				values.add(e.getValue());

		return values;
	}

	@Override
	public Iterable<Entry<K, V>> entrySet() {
		ArrayList<Entry<K, V>> entries = new ArrayList<>();
		for (LinkedList<Entry<K, V>> bucket : buckets)
			for (Entry<K, V> e : bucket)
				entries.add(e);

		return entries;
	}
	

	public String toString()
	{
		String r = "";
		int largestBucket = 0;
		for(int i=0; i < buckets.length; i++)
		{
			if(this.buckets[i].size() > largestBucket)
			{
				largestBucket = this.buckets[i].size();
			}
			r += "Bucket " + i + "( " + this.buckets[i].size() + " ) - ";
			for(Entry<K, V> e : this.buckets[i])
			{
				r += e + " ";
			}
			r += "\n";
		}
		r += "\nNumber of Entries: " + this.size() + "\nLargest Bucket: " + largestBucket + "\nLambda = " + (double)this.size()/buckets.length;
		return r;
	}
	
	private void expandIfNeeded() {
		double loadFactor = (double) numEntries / buckets.length;
		if (loadFactor > 0.75) {

			// Save old entries
			Iterable<Entry<K, V>> entries = entrySet();

			// Create new map twice the size
			initMap(buckets.length << 1);
			
			// Put old entries in new map
			for (Entry<K, V> entry : entries)
				put(entry.getKey(), entry.getValue());
		}
	}
	
	/**
	 * MapEntry class implements the public Entry Interface.
	 * Supports getKey, setValue and getValue
	 */
	private class MapEntry implements Entry<K,V> {
		// entries are an ordered pair
		private K key;
		private V value;

		public MapEntry(K k, V v) {
			key = k;
			value = v;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V v) {
			V oldValue = this.value;
			value = v;
			return oldValue;
		}
		
		public String toString() {
			return "(" + key.toString() + " : " + value.toString() + ")";
		}
		
		
		
	}

}
