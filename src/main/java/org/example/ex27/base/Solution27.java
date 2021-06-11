package org.example.ex27.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    private static String firstName;
    private static String lastName;
    private static String zipCode;
    private static String employeeID;

    public static void main(String[] args) {
        int result = 12345;
        System.out.println("Result: " + result % 10);
        System.out.println("Result2: " + result % 10);
        readUserInput();

        ValidateInput validateInput = new ValidateInput();
        String output = validateInput.validateInput(firstName, lastName, zipCode, employeeID);
        System.out.println(output);
        generateOutput(output);
    }

    public static void readUserInput() {
        System.out.print("Enter the first name: ");
        firstName = in.nextLine();
        System.out.print("Enter the last name: ");
        lastName = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        zipCode = in.nextLine();
        System.out.print("Enter an employee ID: ");
        employeeID = in.nextLine();
    }

    public static void generateOutput(String output) {
        int intOutput = Integer.parseInt(output);

        int employeeIDResult = intOutput % 10; // last #
        int zipCodeResult = employeeIDResult % 10; // 4th #
        int lNameResult = zipCodeResult % 10; // third #
        int fNameResult = lNameResult % 10; // will be the second #

        if(!interpretResults(fNameResult)) {
            System.out.print(" is not a ");
        }
    }

    public static boolean interpretResults(int result) {
        if(result == 2) {
            return true;
        } else {
            return false;
        }
    }
}
