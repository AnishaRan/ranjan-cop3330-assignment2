package org.example.ex38.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anisha Ranjan
 */

import java.util.ArrayList;
import java.util.List;

import static org.example.ex38.base.Solution38.listToArray;

public class Numbers {
    public Integer[] filterEvenNumbers(Integer[] intArray) {
        List<Integer> evenList = new ArrayList<>(0);

        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] % 2 == 0) {
                evenList.add(intArray[i]);
            }
        }
        Integer[] evenArray = listToArray(evenList);
        return evenArray;
    }
}
