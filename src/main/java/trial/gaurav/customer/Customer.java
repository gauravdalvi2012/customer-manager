package trial.gaurav.customer;

/**
 * The `Customer` class represents a customer with a unique ID, a name, and an age.
 */
public class Customer {

    private int customerId;
    private String customerName;
    private int customerAge;

    /**
     * Constructs a new `Customer` object with the given ID, name, and age.
     *
     * @param id   The unique ID of the customer.
     * @param name The name of the customer.
     * @param age  The age of the customer.
     */
    public Customer(int id, String name, int age) {
        customerId = id;
        customerName = name;
        customerAge = age;
    }

    /**
     * Gets the ID of the customer.
     *
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the ID of the customer.
     *
     * @param customerId The customer ID to be set.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the name of the customer.
     *
     * @return The customer's name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the name of the customer.
     *
     * @param customerName The customer's name to be set.
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets the age of the customer.
     *
     * @return The customer's age.
     */
    public int getCustomerAge() {
        return customerAge;
    }

    /**
     * Sets the age of the customer.
     *
     * @param customerAge The customer's age to be set.
     */
    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    /**
     * Checks if the customer's ID equals the specified ID.
     *
     * @param id The ID to compare with the customer's ID.
     * @return True if the customer's ID equals the specified ID, otherwise false.
     */
    public boolean equals(int id) {
        return customerId == id;
    }
}
