package org.example.ex25.base;

public class PasswordValidatorClass {
    public int passwordValidator(String password) {
        /*
        outputStrength levels:
            1: A very weak password = only numbers, fewer than 8 characters.
            2: A weak password = only letters, fewer than 8 characters.
            3: A strong password = letters, at least 1 number, at least 8 characters.
            4: A very strong password = letters, numbers, and special characters, at least 8 characters.
         */

        // DONE determine how many numbers, letters, special characters, and length.

        // create if statement for output strength

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

        /* if(pw has only #'s, < 8)
              A very weak password
           else if(only letters, < 8)
              weak password
           else if (letters, >= 1 letter, >= 8 length))
              strong password
           else if (letters, #'s, special chars, >= 8 length)
              very strong password
           else
              password strength guideline not defined
        */

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
