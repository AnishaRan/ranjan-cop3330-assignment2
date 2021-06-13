package org.example.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Solution36 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> intList;
        intList = getUserInput();
        displayList(intList);
        generateOutput(intList);
    }

    public static List<Integer> getUserInput() {
        List<Integer> intList = new ArrayList<>(0);
        while(true)
        {

            System.out.print("Enter a number: ");
            if(in.hasNextInt()) {
                int input = in.nextInt();
                intList.add(input);
            } else if(in.next().contains("done")) {
                break;
            } else {
            System.out.println("Invalid input. Try again.");
            System.exit(1);
            }
        }
        return intList;
    }

    public static void displayList(List<Integer> intList) {
        int length = intList.size();
        System.out.print("Numbers: ");
        for(int i = 0; i < length-1; i++) {
            System.out.print(intList.get(i) + ", ");
        }
        System.out.print(intList.get(length-1));
    }

    public static void generateOutput(List<Integer> intList) {
        Operations operations = new Operations();

        double avg = operations.average(intList);
        System.out.println("\nThe average is " + avg);
        int min = operations.min(intList);
        System.out.println("The minimum is " + min);
        int max = operations.max(intList);
        System.out.println("The maximum is " + max);
        double std = operations.std(intList, avg);
        System.out.printf("The standard deviation is %.2f", std);

    }
}
