package org.example.ex35.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Names {
    public int randomNumberGenerator(int numOfNames) {
        int min = 0;
        double doubleRandNum = Math.floor(Math.random()*(numOfNames-min+1)+min);
        return (int)doubleRandNum;
    }
}
