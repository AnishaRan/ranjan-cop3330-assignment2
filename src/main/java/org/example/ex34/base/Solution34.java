package org.example.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.Scanner;
import java.util.List;

public class Solution34 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfEmployees = 5;
        displayEmployees(numOfEmployees);

    }

    public static void displayEmployees(int numOfEmployees) {
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        EmployeeArray employeeArray = new EmployeeArray();

        System.out.println("There are 5 employees:");
        for(int i = 0; i < numOfEmployees; i++)
        {
            System.out.println(employees[i]);
        }

        System.out.print("Enter an employee name to remove: ");
        String employee_name = in.nextLine();

        List updatedEmployee = employeeArray.removingEmployeeIndex(employees, employee_name);

        System.out.println("Updated List:");

        //System.out.println(updatedEmployee);
        updatedEmployee.forEach(System.out::println);


        //String updatedEmployeeList = employeeArray.removingEmployeeIndex(employees, remove_employee_idx);

    }
}
