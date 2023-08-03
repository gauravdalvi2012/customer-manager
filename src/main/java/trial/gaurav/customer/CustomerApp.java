package trial.gaurav.customer;

import trial.gaurav.collection.LinkedList;

/**
 * The `CustomerApp` class is the entry point of the customer management application.
 * It initializes the customer records and displays the customer menu for interaction with the user.
 */
public class CustomerApp {

    private static LinkedList<Customer> customerRecords = new LinkedList<Customer>();

    /**
     * The main method, which is the entry point of the customer management application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        CustomerMenu cMenu = new CustomerMenu(customerRecords);

        cMenu.display();
    }
}
