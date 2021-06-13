package org.example.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.Scanner;

public class Solution29 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int result = ValidateUserInput();
        generateOutput(result);
    }

    public static int ValidateUserInput() {
        ValidateUserInput validateUserInput = new ValidateUserInput();
        while(true)
        {
            System.out.print("What is the rate of return? ");
            String input = in.next();
            boolean result = validateUserInput.isValid(input);
            if(result)
            {
                return Integer.parseInt(input);
            } else {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }

    public static void generateOutput(int r) {
        int years = 72 / r;
        System.out.printf("It will take %d years to double your initial investment.", years);
    }
}
