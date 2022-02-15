package com.bnta.week_two_tue.WorkingWithLoops;

public class Exercise5 {
    public static void main(String[] args) {

            int[] newArr = new int[11];
            for (int i = 0; i < newArr.length; i++) {
//                System.out.println(i);
                newArr[i]=i;
            }
            for (int n : newArr) {
                System.out.println(n);

            }
        }

    }

