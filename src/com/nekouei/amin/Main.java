package com.nekouei.amin;

import java.util.Scanner;

/**
 * Main class to interactively generate passwords based on user input.
 */
public class Main {

    /**
     * Main method to start the password generation process.
     *
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the MyPassword Generator!");
        Scanner input = new Scanner(System.in);

        // Prompt user for the number of letters, symbols, and numbers in the password
        System.out.println("How many letters would you like in your password?");
        int nr_letters = input.nextInt();
        System.out.println("How many symbols would you like?");
        int nr_symbols = input.nextInt();
        System.out.println("How many numbers would you like?");
        int nr_numbers = input.nextInt();

        // Create a new PassGenerator instance with user-provided parameters
        PassGenerator newPass = new PassGenerator(nr_letters, nr_numbers, nr_symbols);

        // Generate the password
        String password = newPass.generatePass();

        // Print the generated password
        System.out.println("Your generated password is: " + password);

        input.close(); // Close the scanner to prevent resource leak
    }
}