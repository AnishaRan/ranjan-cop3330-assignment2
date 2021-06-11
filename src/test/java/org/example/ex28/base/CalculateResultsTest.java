package org.example.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

class CalculateResultsTest {

    @Test
    void calculateResult_testcase_from_assignment2() {
        CalculateResults calculateResults = new CalculateResults();
        int[] num = {1, 2, 3, 4, 5};
        int actual = calculateResults.calculateResult(num);
        int expected = 15;
        assertEquals(actual, expected);

    }

    @Test
    void calculateResult_testcase2() {
        CalculateResults calculateResults = new CalculateResults();
        int[] num = {6, 20, 57, 81, 21};
        int actual = calculateResults.calculateResult(num);
        int expected = 185;
        assertEquals(actual, expected);

    }

    @Test
    void calculateResult_testcase3_with_negative_numbers() {
        CalculateResults calculateResults = new CalculateResults();
        int[] num = {-1, 0, 1, -90, 19};
        int actual = calculateResults.calculateResult(num);
        int expected = -71;
        assertEquals(actual, expected);

    }
}