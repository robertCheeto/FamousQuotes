package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean run = true;
        String[] quotes = {"An apple a day keeps the doctor away if you throw it hard enough",
                "Mind Bottling", "Rocket Surgery", "This Ain't my first Pony Ride",
                "We'll burn that bridge when we get to it",
                "There's enough tools in this place to build a barn",
                "Bingle Barrel baby", "It looks could kill", "Survival of the Fitness",
                "Is that you John Wayne? Is this me?"};

        while (run) {
            try {
                System.out.print("Choose a number between 1-10 for a quote: ");
                int index = keyboard.nextInt();
                keyboard.nextLine();

                System.out.print(quotes[index - 1]);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            } // end of try-catch

            System.out.print("\n\nWould you like to see another quote? (Y/N): ");
            String userInput = keyboard.nextLine().toLowerCase().trim();

            switch (userInput) {
                case("y"):
                    System.out.print("Choose a number between 1-10 for a quote: ");
                    int index = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.print(quotes[index - 1]);

                case("n"):
                    System.out.println("Closing program...");
                    run = false;
                    break;
                default:
                    System.out.println("Please enter a valid response.");
            } // end of switch case
        } // end of while loop
    } // end of main()
}
