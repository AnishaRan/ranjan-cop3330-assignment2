package org.example.ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class ValidateInput {
    public String validateInput (String firstName, String lastName, String zipCode, String employeeID) {

        String firstNameResult = validateName(firstName);
        String lastNameResult = validateName(lastName);
        boolean zipCodeResult = validateZipCode(zipCode);
        boolean employeeIDResult = validateEmployeeID(employeeID);

        // 1 - false
        // 2 - true
        // return abcdef => 6 digits no matter what.
        // a = intFirstNameResult => 1 - false: 9 - too short , 8 - "" nothing entered || 2 - true
        // b = intLastNameResult
        // c = intZipCodeResult
        // d = intEmployeeIDResult

        String intFirstNameResult;
        String intLastNameResult;
        String intZipCodeResult;
        String intEmployeeIDResult;
        /*if(firstNameResult) {
            intFirstNameResult = "2";
        } else {
            intFirstNameResult = "1";
        }
        if(lastNameResult) {
            intLastNameResult = "2";
        } else {
            intLastNameResult = "1";
        }*/
        if(zipCodeResult) {
            intZipCodeResult = "2";
        } else {
            intZipCodeResult = "1";
        }
        if(employeeIDResult) {
            intEmployeeIDResult = "2";
        } else {
            intEmployeeIDResult = "1";
        }

        return firstNameResult + lastNameResult + intZipCodeResult + intEmployeeIDResult;
    }

    public String validateName(String name) {
        // must be filled in
        // at least 2 char length
        int problem1_counter = 0;
        int problem2_counter = 0;
        String problem1 = "";
        String problem2 = "";
        int nameLength = name.length();
        if(!name.equals("") && nameLength >= 2) {
            return "22";
        }
        if(name.equals("")) {
            problem1_counter++;
        }
        if(nameLength < 2) {
            problem2_counter++;
        }

        if(problem1_counter != 0) {
            problem1 = "8";
        }
        if(problem2_counter != 0) {
            problem2 = "9";
        }
        return problem1 + problem2;
    }

    public boolean validateZipCode(String zipCode) {
        int length = zipCode.length();
        char char_position;
        int digit_count = 0;
        for(int i = 0; i < length; i++)
        {
            char_position = zipCode.charAt(i);

            if(Character.isDigit(char_position)) {
                digit_count++;
            }

        }
        return digit_count == length;
    }

    public boolean validateEmployeeID(String employeeID) {
        // format AA-1234. So, two letters, a hyphen, and four numbers.
        int employeeIDLength = employeeID.length();
        char char_position;
        int letter_count = 0;
        int digit_count = 0;
        int hyphen_count = 0;
        char hyphen = '-';
        for(int i = 0; i < employeeIDLength; i++)
        {
            char_position = employeeID.charAt(i);


            if(Character.isLetter(char_position)) {
                letter_count++;
            } else if(Character.isDigit(char_position)) {
                digit_count++;
            } else if(employeeID.charAt(i) == hyphen){
                hyphen_count++;
            }

        }
        return letter_count == 2 && hyphen_count == 1 && digit_count == 4;
    }

}
