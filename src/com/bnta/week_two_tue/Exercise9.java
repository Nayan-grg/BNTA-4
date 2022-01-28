package com.bnta.week_two_tue;

public class Exercise9 {
    public static void main(String[] args) {
        int[] num={1,6,17,9,20,5};
        int largestNum=0;
        for (int i = 0; i < num.length; i++) {
            if(largestNum<num[i]){
                largestNum=num[i];
            }
        }
        System.out.println(largestNum);
    }
}
