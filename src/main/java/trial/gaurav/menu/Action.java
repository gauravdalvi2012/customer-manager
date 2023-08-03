package trial.gaurav.menu;

/**
 * The `Action` interface is used to define a contract for classes that represent actions in a menu.
 * Classes implementing this interface must provide a `select()` method that performs the specific action when selected in the menu.
 */
public interface Action {

    /**
     * Performs the action when selected in the menu.
     */
    void select();
}
