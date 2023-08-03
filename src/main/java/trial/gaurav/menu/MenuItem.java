package trial.gaurav.menu;

/**
 * The `MenuItem` class represents an item in the menu with a unique choice number, a name, and an associated action.
 */
public class MenuItem {

    private int choice;
    private String name;
    public Action action;

    /**
     * Constructs a new `MenuItem` object with the given choice, name, and action.
     *
     * @param ch   The unique choice number of the menu item.
     * @param nm   The name of the menu item.
     * @param act  The associated action to be performed when the menu item is selected.
     */
    public MenuItem(int ch, String nm, Action act) {
        choice = ch;
        name = nm;
        action = act;
    }

    /**
     * Displays the menu item on the console.
     * The menu item is displayed in the format: "choice. name".
     */
    public void display() {
        System.out.println(choice + ". " + name);
    }

    /**
     * Gets the choice number of the menu item.
     *
     * @return The choice number of the menu item.
     */
    public int getChoice() {
        return choice;
    }
}
