package org.example.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorClassTest {

    @Test
    void passwordValidator_testing_very_weak_password() {

        PasswordValidatorClass pValidClass = new PasswordValidatorClass();

        int actual = pValidClass.passwordValidator("12345");
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void passwordValidator_testing_weak_password() {

        PasswordValidatorClass pValidClass = new PasswordValidatorClass();

        int actual = pValidClass.passwordValidator("abcdef");
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void passwordValidator_testing_strong_password() {

        PasswordValidatorClass pValidClass = new PasswordValidatorClass();

        int actual = pValidClass.passwordValidator("abc123xyz");
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void passwordValidator_testing_very_strong_password() {

        PasswordValidatorClass pValidClass = new PasswordValidatorClass();

        int actual = pValidClass.passwordValidator("1337h@xor!");
        int expected = 4;

        assertEquals(actual, expected);
    }
}