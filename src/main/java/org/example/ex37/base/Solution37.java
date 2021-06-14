package org.example.ex37.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.Scanner;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        getUserInput();
    }

    private static void getUserInput() {
        System.out.print("What's the minimum length? ");
        int min_length = in.nextInt();
        System.out.print("How many special characters? ");
        int sp_char_length = in.nextInt();
        System.out.print("How many numbers? ");
        int num_length = in.nextInt();
    }
}
