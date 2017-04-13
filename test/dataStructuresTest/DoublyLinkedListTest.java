package dataStructuresTest;

import static org.junit.Assert.*;
import org.junit.Test;
import dataStructures.DoublyLinkedList;

public class DoublyLinkedListTest {

	@Test
	public void testAddHeadAndPeekHead() {
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.addHead(1);
		assertEquals("Head of linked list should be 1", 1, llist.peekHead());
		assertEquals("Tail of linked list should be 1", 1, llist.peekTail());
		llist.addHead(2);
		assertEquals("Head of linked list should be 2", 2, llist.peekHead());
		assertEquals("Tail of linked list should be 1", 1, llist.peekTail());
	}

	@Test
	public void testAddTailAndPeekTail() {
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.addTail(1);
		assertEquals("Head of linked list should be 1", 1, llist.peekHead());
		assertEquals("Tail of linked list should be 1", 1, llist.peekTail());
		llist.addTail(2);
		assertEquals("Head of linked list should be 1", 1, llist.peekHead());
		assertEquals("Tail of linked list should be 2", 2, llist.peekTail());
	}
	
	@Test
	public void testIsEmpty() {
		DoublyLinkedList llist = new DoublyLinkedList();
		assertTrue("List should be empty", llist.isEmpty());
		llist.addHead(1);;
		assertFalse("List should not be empty", llist.isEmpty());
		llist.popHead();
		assertTrue("List should be empty", llist.isEmpty());
	}

	@Test
	public void testPopHead() {
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.addHead(1);
		llist.addHead(2);
		assertEquals("Number popped from head should be 2", 2, llist.popHead());
		assertEquals("Number popped from head should be 1", 1, llist.popHead());
		assertTrue("List should be empty", llist.isEmpty());
	}

	@Test
	public void testPopTail() {
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.addHead(1);
		llist.addHead(2);
		assertEquals("Number popped from tail should be 1", 1, llist.popTail());
		assertEquals("Number popped from tail should be 2", 2, llist.popTail());
		assertTrue("List should be empty", llist.isEmpty());
	}

	@Test
	public void testInList() {
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.addHead(1);
		llist.addHead(2);
		assertTrue("The number 1 should be in the list", llist.inList(1));
		assertTrue("The number 2 should be in the list", llist.inList(2));
		llist.popHead();
		assertFalse("The number 2 should not be in the list", llist.inList(2));
	}

	@Test
	public void testRemove() {
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.addHead(1);
		llist.addHead(2);
		llist.addHead(3);
		llist.addHead(4);
		llist.addHead(5);
		llist.remove(1);
		assertEquals("The tail of the list should be 2", 2, llist.peekTail());
		llist.remove(5);
		assertEquals("The head of the list should be 4", 4, llist.peekHead());
		llist.remove(3);
		assertEquals("The head of the list should be 4", 4, llist.peekHead());
		assertEquals("The tail of the list should be 2", 2, llist.peekTail());
		llist.popHead();
		assertEquals("The element after the head should be 2", 2, llist.peekHead());
	}

}
