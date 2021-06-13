package org.example.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Predictions {
    public int randomNumberGenerator()
    {
        int max = 3;
        int min = 0;
        double doubleRandNum = Math.floor(Math.random()*(max-min+1)+min);
        int randNum = (int)doubleRandNum;
        String[] prediction = {"Yes", "No", "Maybe", "Ask again later."};
        //System.out.println(prediction[randNum]);
        return randNum;
    }
}
