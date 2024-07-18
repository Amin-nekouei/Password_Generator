package com.nekouei.amin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * PassGenerator generates a random password based on specified criteria.
 *
 */
public class PassGenerator {
    private int numLetters;   // Number of letters in the password
    private int numNumbers;   // Number of digits in the password
    private int numSymbol;    // Number of symbols in the password

    // Arrays of characters to choose from
    private char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A',
            'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private char[] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};


    /**
     * Constructs a PassGenerator with specified number of letters, numbers, and symbols.
     *
     * @param numLetters Number of letters in the password
     * @param numNumbers Number of digits in the password
     * @param numSymbol Number of symbols in the password
     */
    public PassGenerator(int numLetters, int numNumbers, int numSymbol) {
        this.numLetters = numLetters;
        this.numNumbers = numNumbers;
        this.numSymbol = numSymbol;
    }
    /**
     * Retrieves the number of letters in the password.
     *
     * @return Number of letters
     */
    public int getNumLetters() {
        return numLetters;
    }

    /**
     * Retrieves the number of digits in the password.
     *
     * @return Number of digits
     */
    public int getNumNumbers() {
        return numNumbers;
    }

    /**
     * Retrieves the number of symbols in the password.
     *
     * @return Number of symbols
     */
    public int getNumSymbol() {
        return numSymbol;
    }

    /**
     * Sets the number of letters in the password.
     *
     * @param numLetters Number of letters to set
     */
    public void setNumLetters(int numLetters) {
        this.numLetters = numLetters;
    }

    /**
     * Sets the number of digits in the password.
     *
     * @param numNumbers Number of digits to set
     */
    public void setNumNumbers(int numNumbers) {
        this.numNumbers = numNumbers;
    }

    /**
     * Sets the number of symbols in the password.
     *
     * @param numSymbol Number of symbols to set
     */
    public void setNumSymbol(int numSymbol) {
        this.numSymbol = numSymbol;
    }

    /**
     * Generates a random password based on the specified criteria.
     *
     * @return Randomly generated password
     */
    public String generatePass() {
        ArrayList<Character> password = new ArrayList<>();
        Random random = new Random();

        // Add random letters
        for (int i = 0; i < this.numLetters; i++) {
            password.add(letters[random.nextInt(0, letters.length)]);
        }

        // Add random numbers
        for (int i = 0; i < this.numNumbers; i++) {
            password.add(numbers[random.nextInt(0, numbers.length)]);
        }

        // Add random symbols
        for (int i = 0; i < this.numSymbol; i++) {
            password.add(symbols[random.nextInt(0, symbols.length)]);
        }

        // Shuffle the password characters for randomness
        Collections.shuffle(password);

        // Convert ArrayList to String
        StringBuilder newString = new StringBuilder();
        for (Character ch :password) {
            newString.append(ch);

        }
        return newString.toString();
    }
}

