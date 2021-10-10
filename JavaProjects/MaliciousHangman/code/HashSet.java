package project4;

import java.util.*;

public class HashSet<E> implements Set<E> {
	
	private final int[] primes = {100663319, 201326611, 402653189, 805306457, 1610612741};
	
	private ArrayList<LinkedList<E>> buckets;
	private int numEntries;
	
	private int p;
	private int a;
	private int b;
	
	public HashSet() {
		initSet(16);
	}
	
	private void initSet(int bucketCount) {
		
		this.buckets = new ArrayList<>();
		this.numEntries = 0;
		
		for (int i = 0; i < bucketCount; i++) {
			buckets.add(new LinkedList<>());
		}
		
		// Init MAD param
		this.p = primes[(int) (Math.random() * primes.length)];
		this.a = (int)(Math.random() * (p-1) + 1);
		this.b = (int)(Math.random() * p);
	}
	
	private int hashFunction(E value) {
		return (Math.abs(value.hashCode() * a + b) % p) % this.buckets.size();
	}

	@Override
	public boolean add(E e) {
		expandIfNeeded();
		int index = hashFunction(e);
		if (!buckets.get(index).contains(e)) {
			buckets.get(index).add(e);
			numEntries++;
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(E e) {
		int index = hashFunction(e);
		if (buckets.get(index).contains(e)) {
			buckets.get(index).remove(e);
			numEntries--;
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(E e) {
		int index = hashFunction(e);
		if (buckets.get(index).contains(e))
			return true;
		return false;
	}

	@Override
	public void addAll(Set<E> T) {
		for (E e : T) {
			add(e);
		}
	}

	@Override
	public void retainAll(Set<E> T) {
		Iterator<E> iter = this.iterator();
		while (iter.hasNext()) {
			E e = iter.next();
			if (!T.contains(e))
				this.remove(e);
		}
	}

	@Override
	public void removeAll(Set<E> T) {
		for (E e : T) {
			this.remove(e);
		}
	}

	
	public int size() {
		return numEntries;
	}
	
	public boolean isEmpty() {
		return numEntries == 0;
	}
	
	@Override
	public Iterator<E> iterator() {
		ArrayList<E> vals = new ArrayList<>();
		for (LinkedList<E> bucket : buckets)
			for (E e : bucket)
				vals.add(e);
		return vals.iterator();
	}

	public String toString()
	{
		String r = "";
		int largestBucket = 0;
		for(int i=0; i < buckets.size(); i++)
		{
			if(buckets.get(i).size() > largestBucket)
			{
				largestBucket = buckets.get(i).size();
			}
			r += "Bucket " + i + "( " + buckets.get(i).size() + " ) - ";
			for(E e : buckets.get(i))
			{
				r += e + " ";
			}
			r += "\n";
		}
		r += "\nNumber of Entries: " + this.size() + "\nLargest Bucket: " + largestBucket + "\nLambda = " + (double)this.size()/buckets.size();
		return r;
	}
	
	private void expandIfNeeded() {
		if (numEntries / buckets.size() > 0.75) {
			Iterator<E> iter = this.iterator();
			initSet(buckets.size() << 1);
			while (iter.hasNext())
				this.add(iter.next());
		}
	}
}
