package org.example.ex25.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static String password;

    public static void main(String[] args) {
        readUserInput();
        PasswordValidatorClass passValidator = new PasswordValidatorClass();
        int outputStrength = passValidator.passwordValidator(password);
        generateOutput(outputStrength, password);

    }

    public static void readUserInput() {
        System.out.print("Enter password: ");
        password = in.next();
    }
    public static void generateOutput(int outputStrength, String password) {
        if(outputStrength == 0){
            System.out.print("password strength guideline not defined by Assignment2ex25.");
        } else if(outputStrength == 1) {
            System.out.print("The password '" + password + "' is a very weak password.");
        } else if(outputStrength == 2) {
            System.out.print("The password '" + password + "' is a weak password.");
        } else if(outputStrength == 3) {
            System.out.print("The password '" + password + "' is a strong password.");
        } else if(outputStrength == 4) {
            System.out.print("The password '" + password + "' is a very strong password.");
        } else {
            System.out.print("Invalid password. Try again.");
        }
    }
}
