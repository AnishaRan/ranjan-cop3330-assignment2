package org.example.ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class MultiplicationTable {
    public int generateMultiplicationTable() {
        int i;
        int j;
        for(i = 1; i <= 12; i++)
        {
            for(j = 1; j <= 12; j++)
            {
                System.out.print(i * j + "\t");
            }
            System.out.print("\n");
        }
        return 1;
    }
}
