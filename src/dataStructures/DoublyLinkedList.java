package dataStructures;

public class DoublyLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void pushHead(T n) {
		Node<T> node = new Node<T>(n);
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
	
	public void pushTail(T n) {
		Node<T> node = new Node<T>(n);
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
	
	public T peekHead() {
		assert head != null;
		return head.data();
	}
	
	public T peekTail() {
		assert tail != null;
		return tail.data();
	}
	
	public T popHead() {
		assert head != null;
		if (tail == head) {
			// There is only 1 value left in the linked list
			Node<T> temp = tail;
			temp.setNext(null);
			temp.setPrev(null);
			tail = null;
			head = null;
			return temp.data();
		}
		Node<T> temp = head;
		head = head.next();
		head.setPrev(null);
		temp.setPrev(null);
		temp.setNext(null);
		return temp.data();
	}
	
	public T popTail() {
		assert tail != null;
		if (tail == head) {
			// There is only 1 value left in the linked list
			Node<T> temp = tail;
			temp.setNext(null);
			temp.setPrev(null);
			tail = null;
			head = null;
			return temp.data();
		}
		Node<T> temp = tail;
		tail = tail.prev();
		tail.setNext(null);
		temp.setPrev(null);
		temp.setNext(null);
		return temp.data();
	}
	
	public boolean inList(T n) {
		if (head == null) {
			return false;
		}
		if (head.data() == n) {
			return true;
		}
		Node<T> nextNode = head.next();
		while (nextNode != null) {
			if (nextNode.data() == n) {
				return true;
			}
			nextNode = nextNode.next();
		}
		return false;
	}
	
	public void remove(T n) {
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
		Node<T> nextNode = head.next();
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
