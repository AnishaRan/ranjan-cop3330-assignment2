package org.example.ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.Locale;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        loopUserInput();
        // Get user input for guess
            // count the amount of guesses that the user entered
            // display if user picked a # too high or too low
        // Once right answer is entered
            // display # of guesses
            // Ask if user wants to play again
            // while loop breaks when user enters 'no'
            // while loop continues if user enters 'yes'

        // Class: GuessTheNumberGame
            // Randomly generate number according to difficulty
                // Take in difficulty int, return random # accordingly
            // Keep track of # of guesses
            // do you wish to play again? loop

    }
    public static void loopUserInput() {
        System.out.println("Let's play Guess the Number!\n");
        GuessingGame guessingGame = new GuessingGame();
        int guess_counter = 1;
        while(true) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int difficulty_level = in.nextInt();
            int randNum = guessingGame.randIntGenerator(difficulty_level);
            System.out.print("I have my number. What's your guess? ");

            while(true) {
                int guess = in.nextInt();
                if(guess == randNum) {
                    System.out.printf("You got it in %d guesses!\n", guess_counter);
                    break;
                } else if(guess > randNum) {
                    System.out.println("Too high. Guess again: ");
                    guess_counter++;
                } else {
                    System.out.println("Too low. Guess again: ");
                    guess_counter++;
                }
            }
            System.out.println("\nDo you wish to play again (Y/N)? ");
            guess_counter = 0;
            String capPlayAgain = in.next();
            String playAgain = capPlayAgain.toLowerCase();
            if(playAgain.equals("n")) {
                break;
            }
        }
    }
}