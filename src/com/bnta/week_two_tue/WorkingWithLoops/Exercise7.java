package com.bnta.week_two_tue.WorkingWithLoops;

import java.util.Arrays;
import java.util.Locale;

public class Exercise7 {
    public static void main(String[] args) {
        String[] stringArr = {"i","sure","do","love","bees"};
//        String[] capitalArr= new String[stringArr.length];
//        for (int i = 0; i < stringArr.length; i++) {
//            capitalArr[i]=stringArr[i].toUpperCase();
//        }
//        System.out.println(Arrays.toString(capitalArr));
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i]=stringArr[i].toUpperCase();
        }
        System.out.println(Arrays.toString(stringArr));
    }
}
