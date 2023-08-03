package trial.gaurav.menu;

import java.util.Scanner;
import trial.gaurav.collection.LinkedList;

/**
 * The `Menu` class provides functionality to display a menu and interact with the user's choices.
 * It uses a linked list of `MenuItem` objects to store and display the menu items.
 */
public class Menu {

    protected LinkedList<MenuItem> menuItems;
    private Scanner sc;

    /**
     * Constructs a new `Menu` object with an empty list of menu items and a new `Scanner` for user input.
     */
    public Menu() {
        menuItems = new LinkedList<MenuItem>();
        sc = new Scanner(System.in);
    }

    /**
     * Displays the menu and handles user interaction.
     * The user is prompted to enter their choice, and the corresponding action is executed.
     */
    public void display() {
        System.out.println("Menu");
        LinkedList<MenuItem> menus = menuItems;

        menus.first();
        MenuItem item;
        while (true) {
            item = menus.current();
            item.display();
            if (!menus.hasNext()) {
                break;
            }
            menus.next();
        }
        System.out.println();

        int choice = collectUserChoice();

        if (choice >= 1 && choice <= menuItems.size()) {
            menus.first();
            MenuItem chosenItem;
            while (true) {
                chosenItem = menus.current();
                if (chosenItem.getChoice() == choice) {
                    break;
                }
                menus.next();
            }
            chosenItem.action.select();
            System.out.println("------------------------------------------------------------------------");
            display();
        } else {
            System.out.println("Choose from the given choices.");
            System.out.println("------------------------------------------------------------------------");
            display();
        }
    }

    /**
     * Collects the user's choice from the console.
     *
     * @return The user's choice as an integer.
     */
    public int collectUserChoice() {
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        return choice;
    }
}
