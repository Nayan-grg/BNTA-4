package com.bnta.week_two_wed.WritingMethods;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(capital("hello"));

    }
    public static String capital(String a){
        char s= a.charAt(0);
        char sc= Character.toUpperCase(s);
        String newA="";
        newA= sc+a.substring(1);
        return newA;
    }

}
