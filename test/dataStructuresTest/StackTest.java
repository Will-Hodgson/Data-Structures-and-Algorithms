package dataStructuresTest;

import static org.junit.Assert.*;
import org.junit.Test;
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
}
