package com.bnta.week_two_mon.ArraysConditionalsMethods;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {

    }
    static String reverse(String input){
        if(input==null){return null;}
        if(input==""){return "";}
        String reverseOutput="";
        for(int i = input.length()-1; i>=0; i--){
            reverseOutput += input.charAt(i);
        }
        return reverseOutput ;
    }

}

