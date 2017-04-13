package dataStructures;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addHead(int n) {
		Node node = new Node(n);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			head.setPrev(node);
			node.setNext(head);
			node.setPrev(null);
			head = node;
		}
	}
	
	public void addTail(int n) {
		Node node = new Node(n);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(null);
			tail = node;
		}
	}
	
	public int peekHead() {
		assert head != null;
		return head.data();
	}
	
	public int peekTail() {
		assert tail != null;
		return tail.data();
	}
	
	public int popHead() {
		assert head != null;
		if (tail == head) {
			// There is only 1 value left in the linked list
			Node temp = tail;
			temp.setNext(null);
			temp.setPrev(null);
			tail = null;
			head = null;
			return temp.data();
		}
		Node temp = head;
		head = head.next();
		head.setPrev(null);
		temp.setPrev(null);
		temp.setNext(null);
		return temp.data();
	}
	
	public int popTail() {
		assert tail != null;
		if (tail == head) {
			// There is only 1 value left in the linked list
			Node temp = tail;
			temp.setNext(null);
			temp.setPrev(null);
			tail = null;
			head = null;
			return temp.data();
		}
		Node temp = tail;
		tail = tail.prev();
		tail.setNext(null);
		temp.setPrev(null);
		temp.setNext(null);
		return temp.data();
	}
	
	public boolean inList(int n) {
		if (head == null) {
			return false;
		}
		if (head.data() == n) {
			return true;
		}
		Node nextNode = head.next();
		while (nextNode != null) {
			if (nextNode.data() == n) {
				return true;
			}
			nextNode = nextNode.next();
		}
		return false;
	}
	
	public void remove(int n) {
		if (head == null) {
			return;
		}
		if (head.data() == n) {
			head = head.next();
			head.setPrev(null);
			return;
		}
		if (tail.data() == n) {
			tail = tail.prev();
			tail.setNext(null);
			return;
		}
		Node nextNode = head.next();
		while (nextNode != null) {
			if (nextNode.data() == n) {
				if (nextNode.next() == null) {
					if (nextNode.prev() == null) {
						head = null;
						tail = null;
					} else {
						nextNode.prev().setNext(null);
					}
				} else if (nextNode.prev() == null) {
					nextNode.next().setPrev(null);
				} else {
					nextNode.prev().setNext(nextNode.next());
					nextNode.next().setPrev(nextNode.prev());
				}
				(nextNode.next()).setPrev(nextNode.prev());
				(nextNode.prev()).setNext(nextNode.next());
				return;
			}
			nextNode = nextNode.next();
		}
	}
}
