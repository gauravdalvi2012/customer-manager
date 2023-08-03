package trial.gaurav.collection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import trial.gaurav.customer.CustomerFinder;

public class LinkedListTest {
	LinkedList<Integer> linkedList;

	@Before
	public void setUp() {
		linkedList = new LinkedList<Integer>();
	}

	@Test
	public void testGetFirst() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		
		assertEquals(Integer.valueOf(1), linkedList.getFirst());
	}

	@Test
	public void testGetLast() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		
		assertEquals(Integer.valueOf(3), linkedList.getLast());
	}

	@Test
	public void testFirst() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		
		linkedList.first();
		
		assertEquals(Integer.valueOf(1), linkedList.current());
	}

	@Test
	public void testLast() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		
		linkedList.last();
		
		assertEquals(Integer.valueOf(3), linkedList.current());
	}

	@Test
	public void testCurrent() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		
		linkedList.first();
		assertEquals(Integer.valueOf(1), linkedList.current());
		linkedList.last();
		assertEquals(Integer.valueOf(3), linkedList.current());
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testSize() {
		assertEquals(0, linkedList.size());
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		assertEquals(3, linkedList.size());
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, linkedList.isEmpty());
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		assertEquals(false, linkedList.isEmpty());
	}

	@Test
	public void testNext() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		assertEquals(Integer.valueOf(1), linkedList.current());
		linkedList.next();
		assertEquals(Integer.valueOf(2), linkedList.current());
	}

	@Test
	public void testHasNext() {
		assertEquals(false, linkedList.hasNext());
		linkedList.insert(1);
		linkedList.insert(2);
		assertEquals(true, linkedList.hasNext());
		linkedList.next();
		assertEquals(false, linkedList.hasNext());
	}

	@Test
	public void testRemove() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
	}

	@Test
	public void testContains() {
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
	}

}
