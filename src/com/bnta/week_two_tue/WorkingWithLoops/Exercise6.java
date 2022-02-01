package com.bnta.week_two_tue.WorkingWithLoops;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] Arr= new int[11];
        int sum =0;
        for (int i = 0; i < Arr.length; i++) {
//            System.out.println(i);
            Arr[i]=i;
            sum+=Arr[i];
        }
        System.out.println(sum);
    }
}
