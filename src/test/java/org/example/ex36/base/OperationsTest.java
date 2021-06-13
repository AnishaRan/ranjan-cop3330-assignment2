package org.example.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void average() {
        Operations operations = new Operations();
        List<Integer> intList = new ArrayList<>(0);
        intList.add(100);
        intList.add(200);
        intList.add(300);
        double actual = operations.average(intList);
        double expected = 200.0;

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void min() {
        Operations operations = new Operations();
        List<Integer> intList = new ArrayList<>(0);
        intList.add(100);
        intList.add(200);
        intList.add(300);
        int actual = operations.min(intList);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void max() {
        Operations operations = new Operations();
        List<Integer> intList = new ArrayList<>(0);
        intList.add(100);
        intList.add(200);
        intList.add(300);
        int actual = operations.max(intList);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    void std() {
        Operations operations = new Operations();
        List<Integer> intList = new ArrayList<>(0);
        intList.add(100);
        intList.add(200);
        intList.add(1000);
        intList.add(300);
        double avg = 400.0;
        double actual = operations.std(intList, avg);
        double expected = 353.5533905932738;

        assertEquals(expected, actual, 0.0001);

    }
}