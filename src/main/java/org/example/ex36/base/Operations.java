package org.example.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */


import java.util.List;

public class Operations {
    public double average(List<Integer> intList) {
        int sum = 0;
        for (Integer integer : intList) {
            sum += integer;
        }

        return 1.0 * (sum)/(intList.size());
    }
    public int min(List<Integer> intList) {
        int min = intList.get(0);
        for (Integer integer : intList) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }

    public int max(List<Integer> intList) {
        int max = intList.get(0);
        for (Integer integer : intList) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public double std(List<Integer> intList, double avg) {
        double std = 0.0;
        for (Integer integer : intList) {
            std = std + Math.pow((integer - avg), 2);
        }
        std = Math.sqrt(std/intList.size());
        return std;
    }
}
