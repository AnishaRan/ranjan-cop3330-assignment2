package org.example.ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class PaymentCalculator {

    public int calculateMonthsUntilPaidOff(double b, double aprPercent, int p) {
        double i = (aprPercent / 100.0) / 365;
        double n = -(1.0/30) * Math.log(1.0 + b/p * (1.0 - Math.pow((1.0 + i), 30.0))) / Math.log(1.0 + i);
        double roundedDoubleN = Math.ceil(n);

        int intN = (int)roundedDoubleN;

        return intN;


    }
}
