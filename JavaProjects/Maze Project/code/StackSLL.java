package maze_project;

public class StackSLL<T> implements Stack<T> {
	private SinglyLinkedList<T> stack;

	public StackSLL() {
		stack = new SinglyLinkedList<T>();
	}

	@Override
	public void push(T v) {
		stack.addFirst(v);
	}

	@Override
	public T pop() {
		return stack.removeFirst();
	}

	@Override
	public T top() {
		return stack.get(0);
	}

	@Override
	public int size() {return stack.size();}

	@Override
	public boolean isEmpty() {return stack.isEmpty();}
	
	public String toString() {return stack.toString();}

}
