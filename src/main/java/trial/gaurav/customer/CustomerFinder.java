package trial.gaurav.customer;

import trial.gaurav.collection.Comparator;
import trial.gaurav.collection.LinkedList;

/**
 * The `CustomerFinder` class represents a comparator to find a customer with a specific ID in a linked list of customers.
 * It implements the `Comparator` interface to define the find() method.
 */
public class CustomerFinder implements Comparator {

    private LinkedList<Customer> customerRecords;
    private int customerId;

    /**
     * Constructs a new `CustomerFinder` object with the given customer records and customer ID to find.
     *
     * @param cRecords The linked list containing the customer records to search.
     * @param id       The customer ID to find.
     */
    public CustomerFinder(LinkedList<Customer> cRecords, int id) {
        customerRecords = cRecords;
        customerId = id;
    }

    /**
     * Finds a customer with the specified ID in the linked list of customers.
     *
     * @return True if the customer with the specified ID is found, otherwise false.
     */
    @Override
    public boolean find() {
        if (customerRecords.current() == null) {
            return false;
        }
        customerRecords.first();

        Customer customer;
        while (true) {
            customer = customerRecords.current();

            if (customer.equals(customerId)) {
                return true;
            }

            if (!customerRecords.hasNext()) {
                break;
            }

            customerRecords.next();
        }

        return false;
    }
}
