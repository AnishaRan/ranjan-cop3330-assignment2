package org.example.ex33.base;

import org.junit.jupiter.api.Test;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import static org.junit.jupiter.api.Assertions.*;

class PredictionsTest {

    @Test
    void randomNumberGenerator_true1() {
        Predictions predictions = new Predictions();
        int actual = predictions.randomNumberGenerator();
        assertTrue(actual >=0 && actual <= 3);
    }

    @Test
    void randomNumberGenerator_false_greater_than_three() {
        Predictions predictions = new Predictions();
        int actual = predictions.randomNumberGenerator();
        assertFalse(actual > 3);
    }

    @Test
    void randomNumberGenerator_false_less_than_zero() {
        Predictions predictions = new Predictions();
        int actual = predictions.randomNumberGenerator();
        assertFalse(actual < 0);
    }
}