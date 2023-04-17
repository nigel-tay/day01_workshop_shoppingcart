package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task:
 * Write a Java console program that allows a user to add, remove and list the contents of a shopping card.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initialise cart
        List<String> cart = new ArrayList<>();

        // Print welcome message
        System.out.print("Good day welcome to your Shopping cart!!!\n> ");
        // Allow user to enter keyboard input
        // Console cons = System.console();

        // List logic
        // String userInput = cons.readLine("Type in a command to begin: 'list', 'add', 'remove' - \n");
        try (Scanner scan = new Scanner(System.in)) {
            String commandGiven = scan.next();
            // String fruit = scan.nextLine();

        // // Keep prompt open until user exits
        // while(!userInput.equals("exit")) {
            // If input is "list" and list is length 0 print "Your cart is empty"
            if (commandGiven.equals("list")) {
                if (cart.size() == 0) {
                    System.out.println("Its empty lmao.");
                }
                // If list has items, print "1. FRUIT \n 2. FRUIT2 \n..."
                else {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.printf("%d. %s\n", (i+1), cart.get(i));
                    }
                }
            }

            // Add fruit logic
                // If added FRUIT already exists, print "You have FRUIT in your cart"

                // If input is "add FRUIT", print "FRUIT added to cart"
                // Split the .nextLine input into a temp array and loop through that (adding and checking)

                // If more than one FRUIT e.g. add orange, pear, print above on individual lines. CHECK FOR COMMAS TO SPLIT INPUT
    
            // Delete fruit logic
            // If specified index does not exist, print "Incorrect item index"
            // if input is "delete INT", remove fruit at specified index and print "FRUIT_AT_INDEX removed from cart"
        // }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
