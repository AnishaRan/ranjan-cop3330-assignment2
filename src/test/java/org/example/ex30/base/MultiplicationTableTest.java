package org.example.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

class MultiplicationTableTest {

    @Test
    void generateMultiplicationTable() {
        MultiplicationTable twelveTable = new MultiplicationTable();
        int expected = 1;
        int actual = twelveTable.generateMultiplicationTable();
        assertEquals(expected,actual);
    }
}