package trial.gaurav.customer;

import trial.gaurav.collection.LinkedList;
import trial.gaurav.console.CustomerConsoleManager;
import trial.gaurav.menu.Action;

/**
 * The `ViewCustomerAction` class represents an action to view a specific customer from the customer records.
 * It implements the `Action` interface to define the behavior of the action when selected in the menu.
 */
public class ViewCustomerAction implements Action {

    private LinkedList<Customer> customerRecords;
    private CustomerConsoleManager customerConsoleManager;

    /**
     * Constructs a new `ViewCustomerAction` object with the given customer records and customer console manager.
     *
     * @param cRecords          The linked list containing the existing customer records.
     * @param cConsoleManager   The customer console manager used to collect the customer ID for viewing.
     */
    public ViewCustomerAction(LinkedList<Customer> cRecords, CustomerConsoleManager cConsoleManager) {
        customerRecords = cRecords;
        customerConsoleManager = cConsoleManager;
    }

    /**
     * Performs the action to view a specific customer from the customer records.
     * The method collects the customer ID from the user, checks if the customer exists, and displays the customer details if found.
     */
    @Override
    public void select() {
        int id = customerConsoleManager.collectCustomerId();

        if (customerRecords.contains(new CustomerFinder(customerRecords, id))) {
            customerConsoleManager.display(customerRecords.current());
        } else {
            System.out.println("\nCustomer does not exist.");
        }
    }
}
