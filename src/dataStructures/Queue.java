package dataStructures;

public class Queue<T> {

	private DoublyLinkedList<T> queue;
	private int length;
	
	public Queue() {
		queue = new DoublyLinkedList<T>();
		length = 0;
	}
	
	public void clear() {
		length = 0;
		queue.clear();
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void add(T n) {
		
		queue.pushTail(n);
		length += 1;
	}
	
	// Pre-Condition: The queue is not empty
	public T peek() {
		
		assert !isEmpty();
		return queue.peekHead();
	}
	
	// Pre-Condition: The queue is not empty
	public T pop() {
		
		assert !isEmpty();
		length -= 1;
		return queue.popHead();
	}
}
