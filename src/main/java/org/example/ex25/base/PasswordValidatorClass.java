package org.example.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class PasswordValidatorClass {
    public int passwordValidator(String password) {

        int length = password.length();
        int special_char_count = 0;
        int letter_count = 0;
        int digit_count = 0;
        char char_position;
        for(int i = 0; i < length; i++)
        {
            char_position = password.charAt(i);

            if(Character.isLetter(char_position)) {
                letter_count++;
            } else if(Character.isDigit(char_position)) {
                digit_count++;
            } else {
                special_char_count++;
            }
        }


        int outputStrength;
        if(digit_count != 0 && special_char_count == 0 && letter_count == 0 && length < 8) {
            outputStrength = 1;
        } else if(digit_count == 0 && special_char_count == 0 && letter_count != 0 && length < 8) {
            outputStrength = 2;
        } else if(digit_count != 0 && special_char_count == 0 && letter_count != 0 && length >= 8) {
            outputStrength = 3;
        } else if(digit_count != 0 && special_char_count != 0 && letter_count != 0 && length >= 8) {
            outputStrength = 4;
        } else {
            outputStrength = 0;
        }
        return outputStrength;
    }
}
