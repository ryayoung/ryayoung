package maze_project;

public interface Queue<T> {
	
	public void enqueue(T v);
	
	public T dequeue();
	
	public T first();
	
	public int size();

	public boolean isEmpty();
}
