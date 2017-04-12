package dataStructuresTest;

import static org.junit.Assert.*;
import org.junit.Test;

import dataStructures.Queue;
import dataStructures.Stack;

public class StackTest {

	@Test
	public void testAddAndPeek() {
		Stack stack = new Stack(10);
		stack.add(1);
		assertEquals("Number on top of stack should be 1", 1, stack.peek());
		
		stack.add(2);
		assertEquals("Number on top of stack should be 2", 2, stack.peek());
	}
	
	@Test
	public void testIsEmpty() {
		Stack stack = new Stack(10);
		assertTrue("The stack should be empty", stack.isEmpty());
		stack.add(1);
		assertFalse("The stack should not be empty", stack.isEmpty());
		stack.pop();
		assertTrue("The stack should be empty", stack.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		Stack stack = new Stack(2);
		assertFalse("The stack should not be full", stack.isFull());
		stack.add(1);
		assertFalse("The stack should not be full", stack.isFull());
		stack.add(2);
		assertTrue("The stack should be full", stack.isFull());
		stack.pop();
		assertFalse("The stack should not be full", stack.isFull());
	}

	@Test
	public void testPop() {
		Stack stack = new Stack(10);
		stack.add(1);		
		stack.add(2);
		assertEquals("Number returned from top of stack should be 2", 2, stack.pop());
		assertEquals("Number returned from top of stack should be 1", 1, stack.pop());
	}
	
	@Test
	public void testLength() {
		Stack stack = new Stack(10);
		assertEquals("The length of the stack should be 0", 0, stack.length());
		stack.add(1);
		assertEquals("The length of the stack should be 1", 1, stack.length());
		stack.add(2);
		assertEquals("The length of the stack should be 2", 2, stack.length());
		stack.pop();
		assertEquals("The length of the stack should be 1", 1, stack.length());
	}
	
	@Test public void testClear() {
		Stack stack = new Stack(10);
		stack.add(1);
		assertEquals("The length of the stack should be 1", 1, stack.length());
		stack.clear();
		assertEquals("The length of the stack should be 0", 0, stack.length());
	}
	
	@Test
	public void testArrayRolloverInQueue() {
		Stack stack = new Stack(4);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		assertTrue("The stack should be full", stack.isFull());
		stack.pop();
		assertFalse("The stack should not be full", stack.isFull());
		stack.add(5);
		assertTrue("The stack should be full", stack.isFull());
		assertEquals("The number at the top of the stack should be 5", 5, stack.pop());
		assertEquals("The next number in the stack should be 3", 3, stack.pop());
		assertEquals("The next number in the stack should be 2", 2, stack.pop());
		assertEquals("The next number in the stack should be 1", 1, stack.pop());
		assertTrue("The stack should be empty", stack.isEmpty());		
	}
}
