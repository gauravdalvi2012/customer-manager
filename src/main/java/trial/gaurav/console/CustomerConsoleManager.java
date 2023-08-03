package trial.gaurav.console;

import java.util.Scanner;

import trial.gaurav.customer.Customer;
import trial.gaurav.customer.CustomerRecordIo;

/**
 * The `CustomerConsoleManager` class provides methods to interact with the console and collect customer details from the user.
 * It implements the `CustomerRecordIo` interface to handle customer record input and output operations.
 */
public class CustomerConsoleManager implements CustomerRecordIo {

    private Scanner scanner;
    private static CustomerConsoleManager INSTANCE;

    /**
     * Private constructor for `CustomerConsoleManager` to ensure singleton pattern.
     *
     * @param sc The scanner object to read user inputs from the console.
     */
    private CustomerConsoleManager(Scanner sc) {
        scanner = sc;
    }

    /**
     * Returns the singleton instance of `CustomerConsoleManager`.
     *
     * @return The singleton instance of `CustomerConsoleManager`.
     */
    public static CustomerConsoleManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerConsoleManager(new Scanner(System.in));
        }
        return INSTANCE;
    }

    /**
     * Collects customer details from the console.
     *
     * @return A `Customer` object containing the customer details entered by the user.
     */
    @Override
    public Customer collectCustomerDetails() {
        System.out.print("\nEnter Customer Id: ");
        int id = scanner.nextInt();
        System.out.print("Enter Customer Name: ");
        scanner.nextLine(); // Consumes the newline character after the previous nextInt().
        String name = scanner.nextLine();
        System.out.print("Enter Customer Age: ");
        int age = scanner.nextInt();

        return new Customer(id, name, age);
    }

    /**
     * Collects the customer ID from the console.
     *
     * @return The customer ID entered by the user.
     */
    @Override
    public int collectCustomerId() {
        System.out.print("\nEnter Customer Id: ");
        int id = scanner.nextInt();

        return id;
    }

    /**
     * Displays the customer details on the console.
     *
     * @param customer The `Customer` object containing the customer details to be displayed.
     */
    @Override
    public void display(Customer customer) {
        System.out.println("\nCustomer Id: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Age: " + customer.getCustomerAge());
    }
}
