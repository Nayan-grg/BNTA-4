package com.bnta.week_two_wed;

public class Exercise4 {
    public static void main(String[] args) {
        check(5,5);
    }
    public static void check(int a, int b){
        if(a==b){
            System.out.println("The numbers are equal");
        }else if(a>b){
            System.out.println("The first number is larger");
        }else{
            System.out.println("The second number is larger");
        }
    }
}
