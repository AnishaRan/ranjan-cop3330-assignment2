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

        String strZCResult = "";
        String strEmpResult = "";

        if(zipCodeResult) {
            strZCResult = "ZC";
        }
        if(employeeIDResult) {
            strEmpResult = "Emp";
        }

        return "FN" + firstNameResult + "LN" + lastNameResult + strZCResult + strEmpResult;

    }

    public String validateName(String name) {
        if(name.equals("")) {
            return "empty";
        } else if(name.length() < 2) {
            return "short";
        } else {
            return  "correct";
        }
    }

    public boolean validateZipCode(String zipCode) {
        int i = 0;
        for(i = 0; i < zipCode.length(); i++) {
            if(!Character.isDigit(zipCode.charAt(i))) {
                break;
            }
        }
        if(i == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateEmployeeID(String employeeID) {
        int num_count = 0;
        int hyphen_count = 0;
        int letter_count = 0;
        int total_char_count = 0;
        for(int i = 0; i < employeeID.length(); i++) {
            if(Character.isDigit(employeeID.charAt(i))) {
                num_count++;
            } else if(Character.isLetter(employeeID.charAt(i))) {
                letter_count++;
            } else if(employeeID.charAt(i) == '-') {
                hyphen_count++;
            } else {
                break;
            }
            total_char_count++;
        }
        if(num_count == 4 && total_char_count == 7 && hyphen_count == 1 && letter_count == 2) {
            return true;
        } else {
            return false;
        }
    }

}
