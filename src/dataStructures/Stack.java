package dataStructures;

public class Stack<T> {
	private DoublyLinkedList<T> stack;
	private int length;
	
	public Stack() {		
		stack = new DoublyLinkedList<T>();
		length = 0;
	}
	
	public void clear() {
		length = 0;
		stack.clear();
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void add(T n) {
		
		stack.pushHead(n);
		length += 1;
	}
	
	// Pre-Condition: The stack is not empty
	public T peek() {
		
		assert !isEmpty();
		return stack.peekHead();
	}
	
	// Pre-Condition: The stack is not empty
	public T pop() {
		
		assert !isEmpty();
		length -= 1;
		return stack.popHead();
	}
}
