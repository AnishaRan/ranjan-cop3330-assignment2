package org.example.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUserInputTest {

    @Test
    void validateUserInput_false1() {
        ValidateUserInput validateUserInput = new ValidateUserInput();
        boolean actual = validateUserInput.isValid("abc");
        assertFalse(actual);
    }

    @Test
    void validateUserInput_true1() {
        ValidateUserInput validateUserInput = new ValidateUserInput();
        boolean actual = validateUserInput.isValid("123");
        assertTrue(actual);
    }

    @Test
    void validateUserInput_zero_false() {
        ValidateUserInput validateUserInput = new ValidateUserInput();
        boolean actual = validateUserInput.isValid("0");
        assertFalse(actual);
    }
}