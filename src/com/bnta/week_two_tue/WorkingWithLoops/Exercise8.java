package com.bnta.week_two_tue.WorkingWithLoops;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        String[] stringArr = {"i","sure","do","love","bees"};
        for (int i = 0; i < stringArr.length; i++) {
            char s= stringArr[i].charAt(0);
//            System.out.println(s);
            char capS = Character.toUpperCase(s);
//            System.out.println(capS);
            stringArr[i]=capS+ stringArr[i].substring(1);
//            System.out.println(stringArr[i]);
        }
        System.out.println(Arrays.toString(stringArr));
    }
}
