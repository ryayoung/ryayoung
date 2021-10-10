package maze_project;

public class QueueDLL<T> implements Queue<T> {

	private DoublyLinkedList<T> queue;

	public QueueDLL() {
		queue = new DoublyLinkedList<>();
	}
	
	@Override
	public void enqueue(T v) {
		queue.addLast(v);
	}

	@Override
	public T dequeue() {
		return queue.removeFirst();
	}
	
	@Override
	public T first() {
		return queue.get(0);
	}
	
	@Override
	public int size() {
		return queue.size();
	}
	
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	@Override
	public String toString() {
		return queue.toString();
	}

}
