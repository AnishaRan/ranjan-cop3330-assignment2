package org.example.ex38.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        List<Integer> intList = getUserInput();
        Integer[] intArray = listToArray(intList);
        Integer[] evenArray = numbers.filterEvenNumbers(intArray);
        System.out.print("The even numbers are ");
        for(int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }

    }

    private static List<Integer> getUserInput() {
        List<Integer> intList = new ArrayList<>(0);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        for(int i = 0; i < 8; i++) {
            intList.add(i, in.nextInt());
        }
        return intList;
    }

    public static Integer[] listToArray(List<Integer> intList) {
        return intList.toArray(new Integer[0]);
    }

}
