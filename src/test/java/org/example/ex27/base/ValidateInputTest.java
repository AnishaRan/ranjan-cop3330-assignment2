package org.example.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

class ValidateInputTest {

    @Test
    void validateName_empty() {
        ValidateInput validateInput = new ValidateInput();
        String actual = validateInput.validateName("");
        String expected = "empty";
        assertEquals(expected, actual);
    }
    @Test
    void validateName_short() {
        ValidateInput validateInput = new ValidateInput();
        String actual = validateInput.validateName("A");
        String expected = "short";
        assertEquals(expected, actual);
    }
    @Test
    void validateName_correct1() {
        ValidateInput validateInput = new ValidateInput();
        String actual = validateInput.validateName("Anisha");
        String expected = "correct";
        assertEquals(expected, actual);
    }
    @Test
    void validateName_correct2() {
        ValidateInput validateInput = new ValidateInput();
        String actual = validateInput.validateName("ASDGHVGHSDKFNCSDKJ");
        String expected = "correct";
        assertEquals(expected, actual);
    }

    @Test
    void validateZipCode_true1() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateZipCode("12345");
        assertTrue(actual);
    }
    @Test
    void validateZipCode_true2() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateZipCode("34687");
        assertTrue(actual);
    }
    @Test
    void validateZipCode_false1() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateZipCode("df350234j");
        assertFalse(actual);
    }
    @Test
    void validateZipCode_false2() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateZipCode("sodis");
        assertFalse(actual);
    }
    @Test
    void validateZipCode_false3() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateZipCode("1234z");
        assertFalse(actual);
    }

    @Test
    void validateEmployeeID_true1() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateEmployeeID("AA-1234");
        assertTrue(actual);
    }
    @Test
    void validateEmployeeID_true2() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateEmployeeID("bo-4035");
        assertTrue(actual);
    }
    @Test
    void validateEmployeeID_true3() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateEmployeeID("bs-3590");
        assertTrue(actual);
    }
    @Test
    void validateEmployeeID_false1() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateEmployeeID("bjs1234");
        assertFalse(actual);
    }
    @Test
    void validateEmployeeID_false2() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateEmployeeID("sd 4390--");
        assertFalse(actual);
    }
    @Test
    void validateEmployeeID_false3() {
        ValidateInput validateInput = new ValidateInput();
        boolean actual = validateInput.validateEmployeeID("as - 2340");
        assertFalse(actual);
    }
}