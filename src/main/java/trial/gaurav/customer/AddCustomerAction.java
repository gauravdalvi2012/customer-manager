package trial.gaurav.customer;

import trial.gaurav.collection.LinkedList;
import trial.gaurav.console.CustomerConsoleManager;
import trial.gaurav.menu.Action;

/**
 * The `AddCustomerAction` class represents an action to add a new customer to the customer records.
 * It implements the `Action` interface to define the behavior of the action when selected in the menu.
 */
public class AddCustomerAction implements Action {

    private LinkedList<Customer> customerRecords;
    private CustomerConsoleManager customerConsoleManager;

    /**
     * Constructs a new `AddCustomerAction` object with the given customer records and customer console manager.
     *
     * @param cRecords           The linked list containing the existing customer records.
     * @param cConsoleManager    The customer console manager used to collect new customer details from the user.
     */
    public AddCustomerAction(LinkedList<Customer> cRecords, CustomerConsoleManager cConsoleManager) {
        customerRecords = cRecords;
        customerConsoleManager = cConsoleManager;
    }

    /**
     * Performs the action to add a new customer to the customer records.
     * The method collects the customer details from the user, checks if the customer ID already exists, and inserts the new customer into the records.
     */
    @Override
    public void select() {
        Customer newCustomer = customerConsoleManager.collectCustomerDetails();

        if (customerRecords.contains(new CustomerFinder(customerRecords, newCustomer.getCustomerId()))) {
            System.out.println("\nCustomer Id already exists.");
        } else {
            customerRecords.insert(newCustomer);
        }
    }
}
