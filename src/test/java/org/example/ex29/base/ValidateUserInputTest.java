package org.example.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUserInputTest {

    @Test
    void validateUserInput() {
        ValidateUserInput validateUserInput = new ValidateUserInput();
        boolean expected = true;
        boolean actual = validateUserInput.validateUserInput();
        assertEquals(expected, actual);
    }
}