package org.example.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    /*
        We are testing whether the value for payment calc is correct.
        We need to test the n value.
     */

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