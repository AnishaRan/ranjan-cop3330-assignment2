package org.example.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

class PaymentCalculatorTest {


    @Test
    void calculateMonthsUntilPaidOff() {
        // given
        PaymentCalculator paymentCalculator = new PaymentCalculator();

        // when
        int actual = paymentCalculator.calculateMonthsUntilPaidOff(5000,12,100);
        int expected = 70;

        // then
        assertEquals(expected, actual);

    }
}