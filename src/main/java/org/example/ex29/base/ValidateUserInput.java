package org.example.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */



public class ValidateUserInput {
   public boolean isValid(String input) {
        int strLength = input.length();
       char char_position;
       for(int i = 0; i < strLength; i++)
       {
           char_position = input.charAt(i);
           if(Character.isLetter(char_position))
           {
                return false;
           }
           if(char_position == '0')
           {
               return false;
           }
       }
       return true;

    }
}
