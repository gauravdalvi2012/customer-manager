package trial.gaurav.customer;

import trial.gaurav.collection.LinkedList;
import trial.gaurav.console.CustomerConsoleManager;
import trial.gaurav.menu.Exit;
import trial.gaurav.menu.Menu;
import trial.gaurav.menu.MenuItem;

/**
 * The `CustomerMenu` class represents a menu specific to customer management.
 * It extends the `Menu` class and provides options to add, view, delete, and display all customers.
 */
public class CustomerMenu extends Menu {

    private LinkedList<Customer> customerRecords;

    /**
     * Constructs a new `CustomerMenu` object with the given customer records.
     *
     * @param cRecords The linked list containing the customer records.
     */
    public CustomerMenu(LinkedList<Customer> cRecords) {
        customerRecords = cRecords;
        setup();
    }

    /**
     * Sets up the customer menu by adding menu items for various customer management actions.
     * The method inserts the menu items with corresponding actions into the menu.
     */
    private void setup() {
        menuItems.insert(new MenuItem(1, "Add Customer", new AddCustomerAction(customerRecords, CustomerConsoleManager.getInstance())));
        menuItems.insert(new MenuItem(2, "View Customer", new ViewCustomerAction(customerRecords, CustomerConsoleManager.getInstance())));
        menuItems.insert(new MenuItem(3, "Delete Customer", new DeleteCustomerAction(customerRecords, CustomerConsoleManager.getInstance())));
        menuItems.insert(new MenuItem(4, "View All Customers", new ViewAllCustomersAction(customerRecords, CustomerConsoleManager.getInstance())));
        menuItems.insert(new MenuItem(5, "Exit", new Exit()));
    }
}
