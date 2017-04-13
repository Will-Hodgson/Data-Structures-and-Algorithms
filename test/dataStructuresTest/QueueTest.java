package dataStructuresTest;

import static org.junit.Assert.*;
import org.junit.Test;
import dataStructures.Queue;

public class QueueTest {

	@Test
	public void testAddAndPeek() {
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(1);
		assertEquals("The number at the top of the queue should be 1", 1, (int) queue.peek());
		
		queue.add(2);
		assertEquals("The number at the top of the queue should be 1", 1, (int) queue.peek());
	}
	
	@Test
	public void testIsEmpty() {
		Queue<Integer> queue = new Queue<Integer>();
		assertTrue("The queue should be empty", queue.isEmpty());
		queue.add(1);
		assertFalse("The queue should not be empty", queue.isEmpty());
		queue.pop();
		assertTrue("The queue should be empty", queue.isEmpty());
	}

	@Test
	public void testPop() {
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(1);		
		queue.add(2);
		assertEquals("The number returned from the queue should be 1", 1, (int) queue.pop());
		assertEquals("The number returned from the queue should be 2", 2, (int) queue.pop());
	}
	
	@Test
	public void testLength() {
		Queue<Integer> queue = new Queue<Integer>();
		assertEquals("The length of the queue should be 0", 0, queue.length());
		queue.add(1);
		assertEquals("The length of the queue should be 1", 1, queue.length());
		queue.add(2);
		assertEquals("The length of the queue should be 2", 2, queue.length());
		queue.pop();
		assertEquals("The length of the queue should be 1", 1, queue.length());
	}
	
	@Test public void testClear() {
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(1);
		assertEquals("The length of the queue should be 1", 1, queue.length());
		queue.clear();
		assertEquals("The length of the queue should be 0", 0, queue.length());
	}
}
