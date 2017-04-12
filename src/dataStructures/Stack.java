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
	public void add(int n) {
		
		assert length < size;
		stack[length] = n;
		length += 1;
	}
	
	public int peek() {
		
		assert length > 0;
		return stack[length-1];
	}
	
	public int pop() {
		
		assert length > 0;
		length -= 1;
		return stack[length];
	}
}
