package org.example.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter age: ");
        int age = getUserInput();
        System.out.print("Enter resting heart rate: ");
        int resting_hr = getUserInput();
        generateOutput(age, resting_hr);
    }

    public static int getUserInput()
    {
        UserInput userInput = new UserInput();
        int intInput;
        while(true)
        {
            String input = in.next();
            boolean inputResult = userInput.isValid(input);
            if(inputResult)
            {
                intInput = Integer.parseInt(input);
                break;
            } else
            {
                System.out.print("Invalid input. Try again: ");
            }
        }
        return intInput;



    }

    public static void generateOutput(int age, int restingHR) {
        System.out.println("Intensity    | Rate");
        System.out.print("-------------|--------\n");
        for(int i = 55; i <= 95; i+=5)
        {
            double target_hr = (((220 - age) - restingHR) * (i * 0.01)) + restingHR;
            System.out.printf("%d%%          | %.0f bpm\n", i, target_hr);
        }


    }



}
