package trial.gaurav.customer;

import trial.gaurav.collection.LinkedList;
import trial.gaurav.console.CustomerConsoleManager;
import trial.gaurav.menu.Action;

/**
 * The `DeleteCustomerAction` class represents an action to delete a customer from the customer records.
 * It implements the `Action` interface to define the behavior of the action when selected in the menu.
 */
public class DeleteCustomerAction implements Action {

    private LinkedList<Customer> customerRecords;
    private CustomerConsoleManager customerConsoleManager;

    /**
     * Constructs a new `DeleteCustomerAction` object with the given customer records and customer console manager.
     *
     * @param cRecords          The linked list containing the existing customer records.
     * @param cConsoleManager   The customer console manager used to collect the customer ID for deletion.
     */
    public DeleteCustomerAction(LinkedList<Customer> cRecords, CustomerConsoleManager cConsoleManager) {
        customerRecords = cRecords;
        customerConsoleManager = cConsoleManager;
    }

    /**
     * Performs the action to delete a customer from the customer records.
     * The method collects the customer ID from the user, checks if the customer exists, and removes the customer from the records if found.
     */
    @Override
    public void select() {
        int id = customerConsoleManager.collectCustomerId();

        if (customerRecords.contains(new CustomerFinder(customerRecords, id))) {
            customerRecords.remove(customerRecords.current());
            System.out.println("\nDeleted Successfully.");
        } else {
            System.out.println("\nCustomer does not exist.");
        }
    }
}
