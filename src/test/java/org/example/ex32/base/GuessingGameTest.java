package org.example.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

class GuessingGameTest {

    @Test
    void randIntGenerator_level_1() {
        GuessingGame guessingGame = new GuessingGame();
        int actual = guessingGame.randIntGenerator(1);
        assertTrue(actual > 0 && actual <= 10);
    }
    @Test
    void randIntGenerator_level_2() {
        GuessingGame guessingGame = new GuessingGame();
        int actual = guessingGame.randIntGenerator(2);
        assertTrue(actual > 0 && actual <= 100);
    }
    @Test
    void randIntGenerator_level_3() {
        GuessingGame guessingGame = new GuessingGame();
        int actual = guessingGame.randIntGenerator(2);
        assertTrue(actual > 0 && actual <= 1000);
    }
}