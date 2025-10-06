package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean run = true;
        String userInput = "";
        String[] quotes = {"\"An apple a day keeps the doctor away if you throw it hard enough\"",
                "\"Mind Bottling", "\"Rocket Surgery\"", "\"This Ain't my first Pony Ride\"",
                "\"We'll burn that bridge when we get to it\"",
                "\"There's enough tools in this place to build a barn\"",
                "\"Bingle Barrel Baby\"", "\"It looks could kill\"", "\"Survival of the Fitness\"",
                "\"Is that you John Wayne? Is this me?\""};

        while (run) {
            try {
                System.out.println("Do you want to choose a quote or select a random one?");
                System.out.print("Press 'Y' to select your own or 'R' to select a random one (Y/R): ");
                userInput = keyboard.nextLine().toLowerCase().trim();

                switch (userInput) {
                    case("y"):
                        System.out.print("\nChoose a number between 1-10 for a quote: ");
                        int index = keyboard.nextInt();
                        keyboard.nextLine();
                        System.out.print("\n" + quotes[index - 1]);
                        break;
                    case("r"):
                        int randomNum = (int)(Math.random() * (10) + 1);
                        System.out.print("\n" + quotes[randomNum - 1]);
                        break;
                    default:
                        System.out.print("\nPlease enter a valid response.");
                        break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            } // end of try-catch

            System.out.print("\n\nWould you like to see another quote? (Y/N): ");
            userInput = keyboard.nextLine().toLowerCase().trim();
            System.out.println("\n");

            switch (userInput) {
                case("y"):
                    break;

                case("n"):
                    System.out.print("\nClosing program...");
                    run = false;
                    break;
                default:
                    System.out.println("Please enter a valid response.\n");
            } // end of switch case
        } // end of while loop
    } // end of main()
}
