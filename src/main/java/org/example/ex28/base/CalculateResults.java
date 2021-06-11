package org.example.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class CalculateResults {
    public int calculateResult(int[] num) {
        int result = 0;

        for(int i = 0; i < 5; i++)
        {
            result += num[i];
        }

        return result;

    }
}
