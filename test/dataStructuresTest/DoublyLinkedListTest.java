package dataStructuresTest;

import static org.junit.Assert.*;
import org.junit.Test;
import dataStructures.DoublyLinkedList;

public class DoublyLinkedListTest {

	@Test
	public void testAddHeadAndPeekHead() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		llist.pushHead(1);
		assertEquals("Head of linked list should be 1", 1, (int) llist.peekHead());
		assertEquals("Tail of linked list should be 1", 1, (int) llist.peekTail());
		llist.pushHead(2);
		assertEquals("Head of linked list should be 2", 2, (int) llist.peekHead());
		assertEquals("Tail of linked list should be 1", 1, (int) llist.peekTail());
	}

	@Test
	public void testAddTailAndPeekTail() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		llist.pushTail(1);
		assertEquals("Head of linked list should be 1", 1, (int) llist.peekHead());
		assertEquals("Tail of linked list should be 1", 1, (int) llist.peekTail());
		llist.pushTail(2);
		assertEquals("Head of linked list should be 1", 1, (int) llist.peekHead());
		assertEquals("Tail of linked list should be 2", 2, (int) llist.peekTail());
	}
	
	@Test
	public void testIsEmpty() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		assertTrue("List should be empty", llist.isEmpty());
		llist.pushHead(1);;
		assertFalse("List should not be empty", llist.isEmpty());
		llist.popHead();
		assertTrue("List should be empty", llist.isEmpty());
	}

	@Test
	public void testPopHead() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		llist.pushHead(1);
		llist.pushHead(2);
		assertEquals("Number popped from head should be 2", 2, (int) llist.popHead());
		assertEquals("Number popped from head should be 1", 1, (int) llist.popHead());
		assertTrue("List should be empty", llist.isEmpty());
	}

	@Test
	public void testPopTail() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		llist.pushHead(1);
		llist.pushHead(2);
		assertEquals("Number popped from tail should be 1", 1, (int) llist.popTail());
		assertEquals("Number popped from tail should be 2", 2, (int) llist.popTail());
		assertTrue("List should be empty", llist.isEmpty());
	}

	@Test
	public void testInList() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		llist.pushHead(1);
		llist.pushHead(2);
		assertTrue("The number 1 should be in the list", llist.inList(1));
		assertTrue("The number 2 should be in the list", llist.inList(2));
		llist.popHead();
		assertFalse("The number 2 should not be in the list", llist.inList(2));
	}

	@Test
	public void testRemove() {
		DoublyLinkedList<Integer> llist = new DoublyLinkedList<Integer>();
		llist.pushHead(1);
		llist.pushHead(2);
		llist.pushHead(3);
		llist.pushHead(4);
		llist.pushHead(5);
		llist.remove(1);
		assertEquals("The tail of the list should be 2", 2, (int) llist.peekTail());
		llist.remove(5);
		assertEquals("The head of the list should be 4", 4, (int) llist.peekHead());
		llist.remove(3);
		assertEquals("The head of the list should be 4", 4, (int) llist.peekHead());
		assertEquals("The tail of the list should be 2", 2, (int) llist.peekTail());
		llist.popHead();
		assertEquals("The element after the head should be 2", 2, (int) llist.peekHead());
	}

}
