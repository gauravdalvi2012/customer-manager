package trial.gaurav.customer;

import trial.gaurav.collection.LinkedList;
import trial.gaurav.console.CustomerConsoleManager;
import trial.gaurav.menu.Action;

/**
 * The `ViewAllCustomersAction` class represents an action to view all customers from the customer records.
 * It implements the `Action` interface to define the behavior of the action when selected in the menu.
 */
public class ViewAllCustomersAction implements Action {

    private LinkedList<Customer> customerRecords;
    private CustomerConsoleManager customerConsoleManager;

    /**
     * Constructs a new `ViewAllCustomersAction` object with the given customer records and customer console manager.
     *
     * @param cRecords          The linked list containing the existing customer records.
     * @param cConsoleManager   The customer console manager used to display customer details.
     */
    public ViewAllCustomersAction(LinkedList<Customer> cRecords, CustomerConsoleManager cConsoleManager) {
        customerRecords = cRecords;
        customerConsoleManager = cConsoleManager;
    }

    /**
     * Performs the action to view all customers from the customer records.
     * The method displays the details of all customers present in the records using the customer console manager.
     */
    @Override
    public void select() {
        Customer customer;

        if (!customerRecords.isEmpty()) {
            customerRecords.first();
            while (true) {
                customer = customerRecords.current();
                customerConsoleManager.display(customer);
                if (!customerRecords.hasNext()) {
                    break;
                }
                customerRecords.next();
            }
        } else {
            System.out.println("\nNo Records Found");
        }
    }
}
