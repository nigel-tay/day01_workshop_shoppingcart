package sg.edu.nus.iss;

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
        System.out.print("~ Good day welcome to your Shopping cart!!!\n");
        // Allow user to enter keyboard input
        // Console cons = System.console();

        // List logic
        // String userInput = cons.readLine("Type in a command to begin: 'list', 'add', 'remove' - \n");
        try (Scanner scan = new Scanner(System.in)) {
            while(!scan.hasNext("exit")){
                String commandGiven = scan.next();

                // Helper function
                if (commandGiven.equals("help")) {
                    System.out.println("~ Here are some commands you may input:");
                    System.out.println("'list'");
                    System.out.println("'add <fruit name>, ...'");
                    System.out.println("'remove <fruit index>'");
                }

                // If input is "list" and list is length 0 print "Your cart is empty"
                if (commandGiven.equals("list")) {
                    if (cart.size() == 0) {
                        System.out.print("~ Its empty lmao.\n");
                    }
                    // If list has items, print "1. FRUIT \n 2. FRUIT2 \n..."
                    else {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.printf("%d. %s\n", (i+1), cart.get(i));
                        }
                    }
                }

                // Add fruit logic
                if (commandGiven.equals("add")) {
                    // If added FRUIT already exists, print "You have FRUIT in your cart"
                    // loop through fruit array to see which fruits alr exist and add those that are not
                    if (scan.hasNextLine()) {
                        String[] tempFruitArray = scan.nextLine().trim().split(", ");
                        for (String fruit: tempFruitArray) {
                            if (cart.contains(fruit)) {
                                System.out.printf("~ You already have %s in your cart :P\n", fruit);
                            }
                            else {
                                // If input is "add FRUIT", print "FRUIT added to cart"
                                cart.add(fruit);
                                System.out.printf("~ YUMMY %s has been added to your cart!\n", fruit);
                            }
                        }
                    }
                }
                // Delete fruit logic
                if (commandGiven.equals("remove")) {
                    Integer inputIndex = Integer.parseInt(scan.nextLine().trim());
                    int idx = inputIndex - 1;
                    // If specified index does not exist, print "Incorrect item index"
                    if (cart.size() == 0 || idx > (cart.size() + 1) || idx < 0) {
                        System.out.print("~ Item index does not exist\n");
                    }
                    else {
                        String chosenFruit = cart.get(idx);
                        System.out.printf("~ %s removed from cart\n", chosenFruit);
                        cart.remove(idx);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("~ Error: " + e);
        }
    }
}
