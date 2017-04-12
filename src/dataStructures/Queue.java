package dataStructures;

public class Queue {

	private int[] queue;
	private int length;
	private int size;
	private int head; // head refers to the next element in the queue
	private int tail; // tail refers to the next open spot in the queue
	
	public Queue(int n) {
		assert n > 0;
		queue = new int[n];
		length = 0;
		size = n;
		head = 0;
		tail = 0;
	}
	
	public void clear() {
		head = 0;
		tail = 0;
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
	
	// Pre-Condition: The queue is not full
	public void add(int n) {
		
		assert !isFull();
		queue[tail] = n;
		tail = (tail + 1) % size;
		length += 1;
	}
	
	// Pre-Condition: The queue is not empty
	public int peek() {
		
		assert !isEmpty();
		return queue[head];
	}
	
	// Pre-Condition: The queue is not empty
	public int pop() {
		
		assert !isEmpty();
		int temp = queue[head];
		head = (head + 1) % size;
		length -= 1;
		return temp;
	}
}
