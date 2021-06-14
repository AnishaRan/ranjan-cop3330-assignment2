package org.example.ex37.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class PasswordGenerator {
    public void randPasswordGenerator(int min_length, int sp_char_length, int num_length) {

        int max = 10;
        int min = 1;
        double doubleRandNum = Math.floor(Math.random()*(max-min+1)+min);
        int randNum = (int)doubleRandNum;
    }
}
