package org.example.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

    @Test
    void isValid_true1() {
        UserInput userInput = new UserInput();
        boolean actual = userInput.isValid("19");
        assertTrue(actual);
    }

    @Test
    void isValid_true2() {
        UserInput userInput = new UserInput();
        boolean actual = userInput.isValid("237590234");
        assertTrue(actual);
    }

    @Test
    void isValid_false1() {
        UserInput userInput = new UserInput();
        boolean actual = userInput.isValid("asdkjg");
        assertFalse(actual);
    }

    @Test
    void isValid_false2() {
        UserInput userInput = new UserInput();
        boolean actual = userInput.isValid("anisha ranjan was here");
        assertFalse(actual);
    }
}