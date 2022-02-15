package com.bnta.week_two_wed.WritingMethods;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(check(2,4));
    }
    public static boolean check(int a, int b){
        boolean compare;
        if (a==b){
            compare= true;
        }else{
            compare=false;
        }return compare;
    }
}
