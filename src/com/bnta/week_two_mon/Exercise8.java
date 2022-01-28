package com.bnta.week_two_mon;

import java.util.Arrays;
import java.util.Locale;

public class Exercise8 {
    public static void main(String[] args) {
        String[] names = {"wfe","wfef","efcer"};
        String[] secondArr= capitalise(names);
        System.out.println(secondArr);

    }
    static String[] capitalise(String[] string) {
        String[] newArray = new String[string.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = string[i].toUpperCase();
        }
        return newArray;
    }
}
