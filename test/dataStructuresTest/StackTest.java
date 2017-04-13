package dataStructuresTest;

import static org.junit.Assert.*;
import org.junit.Test;

import dataStructures.Stack;

public class StackTest {

	@Test
	public void testAddAndPeek() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		assertEquals("Number on top of stack should be 1", 1, (int) stack.peek());
		
		stack.add(2);
		assertEquals("Number on top of stack should be 2", 2, (int) stack.peek());
	}
	
	@Test
	public void testIsEmpty() {
		Stack<Integer> stack = new Stack<Integer>();
		assertTrue("The stack should be empty", stack.isEmpty());
		stack.add(1);
		assertFalse("The stack should not be empty", stack.isEmpty());
		stack.pop();
		assertTrue("The stack should be empty", stack.isEmpty());
	}

	@Test
	public void testPop() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);		
		stack.add(2);
		assertEquals("Number returned from top of stack should be 2", 2, (int) stack.pop());
		assertEquals("Number returned from top of stack should be 1", 1, (int) stack.pop());
	}
	
	@Test
	public void testLength() {
		Stack<Integer> stack = new Stack<Integer>();
		assertEquals("The length of the stack should be 0", 0, stack.length());
		stack.add(1);
		assertEquals("The length of the stack should be 1", 1, stack.length());
		stack.add(2);
		assertEquals("The length of the stack should be 2", 2, stack.length());
		stack.pop();
		assertEquals("The length of the stack should be 1", 1, stack.length());
	}
	
	@Test public void testClear() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		assertEquals("The length of the stack should be 1", 1, stack.length());
		stack.clear();
		assertEquals("The length of the stack should be 0", 0, stack.length());
	}
}
