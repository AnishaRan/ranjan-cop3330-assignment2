package org.example.ex28.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);

    private static int[] num;

    public static void main(String[] args) {
        readUserInput();
        CalculateResults calculateResults = new CalculateResults();
        int sum = calculateResults.calculateResult(num);
        generateOutput(sum);

        // display output
    }

    public static void readUserInput() {
        num = new int[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            num[i] = in.nextInt();
        }
    }

    public static void generateOutput(int sum) {
        System.out.printf("The total is %d.", sum);
    }

}
