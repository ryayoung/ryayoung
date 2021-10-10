package maze_project;
import java.util.*;
public class SinglyLinkedList<T> {
	/* Ryan Young - 4.20.2021
	 * This is a generic singly linked list class.
	 * 
	 */

	private Node head;
	private int size;
	
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}

	public void reverseList() {
		/* This method reverses the linked list by simply making
		 * each node's Next pointer point backwards.
		 */
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void addFirst(T v) {
		head = new Node(v, head);
		size++;
	}
	
	public void addLast(T v) {
		if (size == 0) {
			head = new Node(v);
		} else {
			Node newNode = new Node(v);
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = newNode;
		}
		size++;
	}
	
	public T removeFirst() {
		
		if (head == null) throw new NoSuchElementException("Trying to remove from an empty list");
		
		T valueToReturn = head.value;
		
		head = head.next;
		size--;
		
		return valueToReturn;
	}
	
	public T removeLast() {
		if (head == null) throw new NoSuchElementException("Trying to remove from an empty list");
		
		T valueToReturn = head.value;
		if (head.next == null) {
			head = null;
			size--;
			return valueToReturn;
		}
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		valueToReturn = curr.next.value;
		curr.next = null;
		size--;
		return valueToReturn;
	}

	public int search(T v) {
		Node curr = head;
		int index = 0;
		
		while (curr != null) {
			if (curr.value.equals(v)) {
				return index;
			}
			curr = curr.next;
			index++;
		}
		
		return -1;
	}

	public T get(int i) {
		if (head == null) throw new NoSuchElementException("Can't retrieve an element from an empty list.");
		if (i > size - 1) throw new IndexOutOfBoundsException("Invalid index.");
		
		Node curr = head;
		
		for (int k = 0; k < i; k++) {
			curr = curr.next;
		}
		return curr.value;
	}

	public boolean remove(T v) {
		Node curr = head;
		
		if (head == null) throw new NoSuchElementException("Trying to remove from empty list.");

		if (head.next == null) {
			head = null;
			size--;
			return true;
		}
		if (head.value.equals(v)) {
			head = head.next;
			size--;
			return true;
		}
		while (curr.next != null) {
			if (curr.next.value.equals(v)) {
				curr.next = curr.next.next;
				size--;
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	@Override
	public String toString() {

		String r = "";
		Node current = head;

		while (current != null) {
			r += current.toString() + " ";
			current = current.next;
		}
		return r;
	}
	
	public T removeLastElement() {
		
		if (head == null) throw new NoSuchElementException("List is empty.");
		
		T returnValue = null;
		
		if (head.next == null) {
			returnValue = head.value;
			head = null;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			returnValue = temp.next.value;
			temp.next = null;
		}
		size--;
		return returnValue;
	}

	public T outputLastElement() {
		
		if (head == null) throw new NoSuchElementException("List is empty.");
		
		T returnValue = null;
		
		if (head.next == null) {
			returnValue = head.value;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			returnValue = temp.next.value;
		}
		return returnValue;
	}
	
	public T valueAtIndex(int index) throws IndexOutOfBoundsException {
		
		if (head == null) throw new NoSuchElementException("List is empty.");
		
		T returnValue = null;
		Node current = head;
		
		for (int i = 0; i <= index; i++) {
			if (current == null) throw new IndexOutOfBoundsException();
			if (i == index) returnValue = current.value;
			current = current.next;
		}
		return returnValue;
	}

	public T removeAtIndex(int index) throws IndexOutOfBoundsException {
		
		if (head == null) throw new NoSuchElementException("List is empty.");
		
		T returnValue = null;
		Node current = head;
		Node previous = null;

		if (index == 0) {
			returnValue = head.value;
			head = current.next;
			return returnValue;
		}
		
		for (int i = 0; i <= index; i++) {
			if (current == null) throw new IndexOutOfBoundsException();
			if (i == index) {
				returnValue = current.value;
				previous.next = current.next;
			}
			previous = current;
			current = current.next;
		}

		size--;
		return returnValue;
	}
	
	public boolean isEmpty() {
		
		if (head == null && size != 0) {
			throw new NoSuchElementException("Something is wrong. Head is null, but size isn't zero.");
		}
		if (head != null && size == 0) {
			throw new NoSuchElementException("Something is wrong. Size is zero, but head isn't null.");
		}
		
		
		if (head == null && size == 0) return true;
		return false;

	}

	public int size() {return size;}

	
	private class Node {
		
		T value;
		private Node next;
		
		public Node(T v) {
			this.value = v;
			this.next = null;
		}
		
		public Node(T v, Node n) {
			value = v;
			next = n;
		}
		
		public String toString() {
			return value.toString();
		}

	}

}
