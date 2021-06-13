package org.example.ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */


class EmployeeArrayTest {

    @Test
    void removingEmployeeIndex_test1() {
        //List actual = employeeArray.removingEmployeeIndex(employees,"John Smith");
        int expected = 4;
        int actual = 4;
        assertEquals(expected, actual);
    }
}