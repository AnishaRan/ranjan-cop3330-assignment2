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
        ValidateInput validateInput = new ValidateInput();
        readUserInput();
        String output = validateInput.validateInput(firstName, lastName, zipCode, employeeID);
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

    public static void generateOutput(String results) {
        if(results.contains("FNempty")) {
            System.out.println("The first name must be at least 2 characters long.");
            System.out.println("The first name must be filled in.");
        } else if(results.contains("FNshort")) {
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(results.contains("FNcorrectLNcorrectZCEmp")) {
            System.out.println("There were no errors found.");
        }
        if(results.contains("LNempty")) {
            System.out.println("The last name must be at least 2 characters long.");
            System.out.println("The last name must be filled in.");
        } else if(results.contains("LNshort")) {
            System.out.println("The last name must be at least 2 characters long.");
        }
        if(!results.contains("Emp")) {
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        if(!results.contains("ZC")) {
            System.out.println("The zipcode must be a 5 digit number.");
        }

    }

}
