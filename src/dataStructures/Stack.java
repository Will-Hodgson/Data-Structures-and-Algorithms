package dataStructures;

public class Stack<T> {
	private T[] stack;
	private int length;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Stack(int n) {
		
		assert n > 0;
		stack = (T[]) new Object[n];
		size = n;
		length = 0;
	}
	
	public void clear() {
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public boolean isFull() {
		return length == size;
	}
	
	// Pre-Condition: The stack is not full
	public void add(T n) {
		
		assert !isFull();
		stack[length] = n;
		length += 1;
	}
	
	// Pre-Condition: The stack is not empty
	public T peek() {
		
		assert !isEmpty();
		return stack[length-1];
	}
	
	// Pre-Condition: The stack is not empty
	public T pop() {
		
		assert !isEmpty();
		length -= 1;
		return stack[length];
	}
}
