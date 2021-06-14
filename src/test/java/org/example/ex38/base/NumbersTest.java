package org.example.ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */


class NumbersTest {

    @Test
    void filterEvenNumbers_true() {
        Numbers numbers = new Numbers();
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] actual = numbers.filterEvenNumbers(intArray);
        Integer[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    void filterEvenNumbers_true2() {
        Numbers numbers = new Numbers();
        Integer[] intArray = {1, 8, 5, 24, 5, 9, 19, 20};
        Integer[] actual = numbers.filterEvenNumbers(intArray);
        Integer[] expected = {8, 24, 20};
        assertArrayEquals(expected, actual);
    }
}