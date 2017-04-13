package dataStructures;

public class Node {

	private int data;
	private Node next;
	private Node prev;
	
	public Node(int n) {
		data = n;
		next = null;
		prev = null;
	}
	
	public int data() {
		return data;
	}
	
	public void setData(int n) {
		data = n;
	}
	
	public Node next() {
		return next;
	}
	
	public Node prev() {
		return prev;
	}
	
	public void setNext(Node node) {
		next = node;
	}
	
	public void setPrev(Node node) {
		prev = node;
	}
}
