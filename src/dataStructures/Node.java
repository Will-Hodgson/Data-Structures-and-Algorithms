package dataStructures;

public class Node<T> {

	private T data;
	private Node<T> next;
	private Node<T> prev;
	
	public Node(T n) {
		data = n;
		next = null;
		prev = null;
	}
	
	public T data() {
		return data;
	}
	
	public void setData(T n) {
		data = n;
	}
	
	public Node<T> next() {
		return next;
	}
	
	public Node<T> prev() {
		return prev;
	}
	
	public void setNext(Node<T> node) {
		next = node;
	}
	
	public void setPrev(Node<T> node) {
		prev = node;
	}
}
