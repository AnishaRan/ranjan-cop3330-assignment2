package org.example.ex26.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);

    private static double b;
    private static double aprPercent;
    private static int p;


    public static void main(String[] args) {

        readUserInput();
        PaymentCalculator pCalc = new PaymentCalculator();
        int result = pCalc.calculateMonthsUntilPaidOff(b, aprPercent, p);

        String output = generateOutput(result);

        System.out.print(output);





    }

    public static void readUserInput() {
        System.out.print("What is your balance? ");
        b = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        aprPercent = in.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        p = in.nextInt();
    }

    public static String generateOutput(int n) {
        return "It will take you " + n + " months to pay off this card.";
    }
}
