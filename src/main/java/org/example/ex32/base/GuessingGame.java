package org.example.ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class GuessingGame {
    public int randIntGenerator(int difficulty_level) {
        int randNum = 0;
        if(difficulty_level == 1) {
            int max = 10;
            int min = 1;
            double doubleRandNum = Math.floor(Math.random()*(max-min+1)+min);
            randNum = (int)doubleRandNum;
        } else if(difficulty_level == 2) {
            int max = 100;
            int min = 1;
            double doubleRandNum = Math.floor(Math.random()*(max-min+1)+min);
            randNum = (int)doubleRandNum;
        } else if(difficulty_level == 3) {
            int max = 1000;
            int min = 1;
            double doubleRandNum = Math.floor(Math.random()*(max-min+1)+min);
            randNum = (int)doubleRandNum;
        }
        return randNum;
    }
    public String guessOutput(int guess, int randNum) {
        if(guess > randNum) {
            return "high";
        } else if(guess < randNum) {
            return "low";
        } else {
            return "correct";
        }
    }
}
