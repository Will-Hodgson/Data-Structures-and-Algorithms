package dataStructures;

import static org.junit.Assert.*;
import org.junit.Test;
import dataStructures.Queue;

public class QueueTest {

	@Test
	public void testAddAndPeek() {
		Queue queue = new Queue(10);
		queue.add(1);
		assertEquals("The number at the top of the queue should be 1", 1, queue.peek());
		
		queue.add(2);
		assertEquals("The number at the top of the queue should be 1", 1, queue.peek());
	}
	
	@Test
	public void testIsEmpty() {
		Queue queue = new Queue(10);
		assertTrue("The queue should be empty", queue.isEmpty());
		queue.add(1);
		assertFalse("The queue should not be empty", queue.isEmpty());
		queue.pop();
		assertTrue("The queue should be empty", queue.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		Queue queue = new Queue(2);
		assertFalse("The queue should not be full", queue.isFull());
		queue.add(1);
		assertFalse("The queue should not be full", queue.isFull());
		queue.add(2);
		assertTrue("The queue should be full", queue.isFull());
		queue.pop();
		assertFalse("The queue should not be full", queue.isFull());
	}

	@Test
	public void testPop() {
		Queue queue = new Queue(10);
		queue.add(1);		
		queue.add(2);
		assertEquals("The number returned from the queue should be 1", 1, queue.pop());
		assertEquals("The number returned from the queue should be 2", 2, queue.pop());
	}
	
	@Test
	public void testLength() {
		Queue queue = new Queue(10);
		assertEquals("The length of the queue should be 0", 0, queue.length());
		queue.add(1);
		assertEquals("The length of the queue should be 1", 1, queue.length());
		queue.add(2);
		assertEquals("The length of the queue should be 2", 2, queue.length());
		queue.pop();
		assertEquals("The length of the queue should be 1", 1, queue.length());
	}
	
	@Test public void testClear() {
		Queue queue = new Queue(10);
		queue.add(1);
		assertEquals("The length of the queue should be 1", 1, queue.length());
		queue.clear();
		assertEquals("The length of the queue should be 0", 0, queue.length());
	}
	
	@Test public void testArrayRolloverInQueue() {
		Queue queue = new Queue(4);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		assertTrue("The queue should be full", queue.isFull());
		queue.pop();
		assertFalse("The queue should not be full", queue.isFull());
		queue.add(5);
		assertTrue("The queue should be full", queue.isFull());
		assertEquals("The number at the top of the queue should be 2", 2, queue.pop());
		assertEquals("The next number in the queue should be 3", 3, queue.pop());
		assertEquals("The next number in the queue should be 4", 4, queue.pop());
		assertEquals("The next number in the queue should be 5", 5, queue.pop());
		assertTrue("The queue should be empty", queue.isEmpty());		
	}

}
