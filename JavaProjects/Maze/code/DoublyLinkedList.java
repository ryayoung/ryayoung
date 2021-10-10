package maze_project;
import java.util.*;
public class DoublyLinkedList<T> {

	private Node header;
	private Node trailer;
	private int size;
	
	public DoublyLinkedList() {
		size = 0;

		header = new Node();
		trailer = new Node();
		header.next = trailer;
		trailer.prev = header;
	}

	public void addFirst(T v) {
		try {
			addBetween(v, header, header.next);
		} catch(Exception e) {
			System.out.println("Had trouble adding first.");
		}
	}
	
	public void addLast(T v) {
		try {
			addBetween(v, trailer.prev, trailer);
		} catch(Exception e) {
			System.out.println("Had trouble adding last.");
		}
	}
	
	public T removeFirst() {
		if (header.next == trailer) throw new NoSuchElementException();
		size--;
		return removeBetween(header, header.next.next);
	}
	
	private void addBetween(T v, Node first, Node second) throws Exception {
		if (first.next == second && second.prev == first) {
			Node newNode = new Node(v, second, first);
			
			first.next = newNode;
			second.prev = newNode;
			size++;
		} else {
			throw new Exception("Problem in addBetween: First and second node are not next to each other");
		}
	}

	private T removeBetween(Node node1, Node node2) {
		if (node1 ==  null || node2 == null) {
			throw new IllegalArgumentException("Must have valid parameters");
		}
		if (header.next ==  trailer) {
			throw new NoSuchElementException("Cannot delete from an empty list");
		}
		if(node1.next.next != node2) {
			throw new IllegalArgumentException("Must be 1 node apart");
		}
		T valueToReturn = node1.next.value;

		node1.next = node2;
		node2.prev = node1;
		
		return valueToReturn;
	}
		
	public int search(T v) {
		Node curr = header.next;
		int index = 0;
		
		while (curr != trailer) {
			if (curr.value == v) {
				return index;
			}
			curr = curr.next;
			index++;
		}
		
		return -1;
	}

	public T get(int i) {
		if (size == 0) throw new NoSuchElementException("Can't retrieve an element from an empty list.");
		if (i > size - 1) throw new IndexOutOfBoundsException("Invalid index.");
		
		Node curr = header.next;
		
		for (int k = 0; k < i; k++) {
			curr = curr.next;
		}
		return curr.value;
	}
		
	@Override
	public String toString() {

		String r = "List: ";
		Node temp = header.next;

		while (temp != trailer) {
			if (temp.value != null)
				r += temp.toString() + " ";
			temp = temp.next;
		}
		return r;
	}
	

	
	public T removeAtIndex(int index) throws IndexOutOfBoundsException {
		if (header == null) throw new NoSuchElementException();
		
		Node temp = header.next;
		
		if (index == 0) {
			size--;
			return removeBetween(header, header.next.next);
		}
		
		for (int i = 0; temp.value != null && i < index - 1; i++) {
			temp = temp.next;
		}
		
		if (temp.value == null || temp.next == null) throw new IndexOutOfBoundsException();
		
		size--;
		return removeBetween(temp, temp.next.next);
	}

	public int size() {return size;}
	
	public boolean isEmpty() {return size == 0;}

	private class Node {
		
		T value;
		private Node next;
		private Node prev;
		
		public Node() {
			this.value = null;
			this.next = null;
			this.prev = null;
		}

		public Node(T v) {
			this.value = v;
			this.next = null;
			this.prev = null;
		}
		
		public Node(T v, Node n, Node p) {
			value = v;
			next = n;
			prev = p;
		}
		
		public String toString() {
			return value.toString();
		}

	}
}