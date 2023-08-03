package trial.gaurav.menu;

/**
 * The `Exit` class represents an action to terminate the program when selected in the menu.
 */
public class Exit implements Action {

    /**
     * Performs the action to exit the program.
     * The method terminates the program with a status code of 0.
     */
    @Override
    public void select() {
        System.exit(0);
    }
}
