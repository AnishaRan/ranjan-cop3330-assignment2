package org.example.ex26.base;

public class PaymentCalculator {
    // calculateMonthsUntilPaidOff
        // does calculations w/ formula
        // needs  i, b, and p
        // we have apr percent (i = daily rate), balance (b), monthly payment (p)
        // returns month (n)
        // month is int rounded up
    public int calculateMonthsUntilPaidOff(double b, double aprPercent, int p) {
        double i = (aprPercent / 100.0) / 365;
        double n = -(1.0/30) * Math.log(1.0 + b/p * Math.pow(1.0 - (1.0 + i), 30.0)) / Math.log(1.0 + i);

        int intN = (int) Math.ceil(n);

        System.out.println(intN);


        return intN;


    }
}
