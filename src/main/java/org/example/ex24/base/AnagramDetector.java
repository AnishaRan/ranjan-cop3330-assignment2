package org.example.ex24.base;

import java.util.Arrays;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {

        int word1_length = word1.length();
        int word2_length = word2.length();

        if(word1_length != word2_length) {
            return false;
        } else {
            char[] word1CharArray = word1.toCharArray();
            char[] word2CharArray = word2.toCharArray();
            Arrays.sort(word1CharArray);
            Arrays.sort(word2CharArray);

            return Arrays.equals(word1CharArray, word2CharArray);

        }

    }
}
