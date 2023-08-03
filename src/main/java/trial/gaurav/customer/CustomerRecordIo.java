package trial.gaurav.customer;

/**
 * The `CustomerRecordIo` interface provides a contract for classes that handle customer record input and output operations.
 */
public interface CustomerRecordIo {

    /**
     * Collects customer details from the user.
     *
     * @return A `Customer` object containing the customer details entered by the user.
     */
    Customer collectCustomerDetails();

    /**
     * Collects the customer ID from the user.
     *
     * @return The customer ID entered by the user.
     */
    int collectCustomerId();

    /**
     * Displays the customer details on the console.
     *
     * @param customer The `Customer` object containing the customer details to be displayed.
     */
    void display(Customer customer);
}
