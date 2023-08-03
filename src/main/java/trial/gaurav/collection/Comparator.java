package trial.gaurav.collection;

/**
 * The `Comparator` interface is used to define a contract for classes that perform a specific comparison operation.
 * Classes implementing this interface must provide a method for the comparison logic.
 */
public interface Comparator {

    /**
     * Performs the comparison operation defined by the implementing class.
     *
     * @return True if the specified condition is met, otherwise false.
     */
    boolean find();
}