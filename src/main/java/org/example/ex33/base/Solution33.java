package org.example.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.Scanner;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Predictions predictions = new Predictions();
        getUserInput();
        int randNum = predictions.randomNumberGenerator();
        displayOutput(randNum);

    }
    public static void getUserInput() {
        System.out.print("What's your question?\n> ");
        String question = in.nextLine();
    }
    public static void displayOutput(int randNum) {
        String[] prediction = {"Yes", "No", "Maybe", "Ask again later."};
        Predictions predictions = new Predictions();
        randNum = predictions.randomNumberGenerator();
        System.out.println(prediction[randNum]);
    }
}
