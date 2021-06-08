package org.example.ex24.base;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

        public static void main(String[] args) {
            // read 2 strings
            readUserInput();


            AnagramDetector ad = new AnagramDetector();
            boolean result = ad.isAnagram(word1, word2);

            String output = generateOutput(result);

            System.out.println(output);
        }


        public static void readUserInput() {
            System.out.println("Enter two strings and I'll tell you if they are anagrams:");
            System.out.println("Enter word 1: ");
            word1 = in.next();

            System.out.println("Enter word 2: ");
            word2 = in.next();
        }
        public static String generateOutput(boolean isAnagram) {
            String output;
            if(isAnagram) {
                return "is anagram";
            } else {
                return "is not anagram";
            }
        }

}
