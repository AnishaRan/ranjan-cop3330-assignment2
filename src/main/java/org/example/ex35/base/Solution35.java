package org.example.ex35.base;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class Solution35 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        getNames_and_result();
    }
    public static void getNames_and_result() {
        int numOfNames = 0;
        ArrayList<String> names = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter a name: ");
            String name = in.nextLine();
            if(name.equals("")) {
                break;
            } else {
                names.add(name);
                numOfNames++;
            }
        }
        Names nameClass = new Names();
        int randNum = nameClass.randomNumberGenerator(numOfNames);
        System.out.printf("The winner is... %s", names.get(randNum));
    }
}
