package dataStructures;

public class Stack {
	private int[] stack;
	private int length;
	private int size;
	
	public Stack(int n) {
		
		assert n > 0;
		stack = new int[n];
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
	public void add(int n) {
		
		assert !isFull();
		stack[length] = n;
		length += 1;
	}
	
	// Pre-Condition: The stack is not empty
	public int peek() {
		
		assert !isEmpty();
		return stack[length-1];
	}
	
	// Pre-Condition: The stack is not empty
	public int pop() {
		
		assert !isEmpty();
		length -= 1;
		return stack[length];
	}
}
