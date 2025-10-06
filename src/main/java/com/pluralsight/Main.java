package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] quotes = {"An apple a day keeps the doctor away if you throw it hard enough",
                "Mind Bottling", "Rocket Surgery", "This Ain't my first Pony Ride",
                "We'll burn that bridge when we get to it",
                "There's enough tools in this place to build a barn",
                "Bingle Barrel baby", "It looks could kill", "Survival of the Fitness",
                "Is that you John Wayne? Is this me?"};

        System.out.print("Choose a number between 1-10 for a quote: ");
        int index = keyboard.nextInt();
        System.out.println(quotes[index - 1]);

    }
}
