package org.example.ex35.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

class NamesTest {

    @Test
    void randomNumberGenerator_true() {
        Names names = new Names();
        int actual = names.randomNumberGenerator(7);
        assertTrue(actual > 0 && actual <= 7);
    }
    @Test
    void randomNumberGenerator_false() {
        Names names = new Names();
        int actual = names.randomNumberGenerator(3);
        assertFalse(actual < 0 && actual > 3);
    }
}