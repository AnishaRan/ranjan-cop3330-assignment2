package org.example.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeArray {

    public List removingEmployeeIndex(String[] employees, String remove_name) {
        List<String> employeeList = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        employeeList.removeIf(employee -> employee.contains(remove_name));

        return employeeList;

    }
}
