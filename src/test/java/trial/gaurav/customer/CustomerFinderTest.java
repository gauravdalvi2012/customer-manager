package trial.gaurav.customer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import trial.gaurav.collection.LinkedList;

public class CustomerFinderTest {
	private LinkedList<Customer> customerRecords;

	@Before
	public void setUp() {
		customerRecords = new LinkedList<Customer>();
	}

	@Test
	public void testFind() {
		assertEquals(false, customerRecords.contains(new CustomerFinder(customerRecords, 101)));
		customerRecords.insert(new Customer(101, "gaurav", 21));
		customerRecords.insert(new Customer(102, "dalvi", 22));
		assertEquals(true, customerRecords.contains(new CustomerFinder(customerRecords, 101)));
		assertEquals(true, customerRecords.contains(new CustomerFinder(customerRecords, 102)));
		assertEquals(false, customerRecords.contains(new CustomerFinder(customerRecords, 103)));
	}

}
