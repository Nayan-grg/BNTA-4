package com.bnta.week_two_mon.ArraysConditionalsMethods;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
//        String string="whatever";
//        String reverse = new StringBuffer(string).reverse().toString();
//        System.out.println(reverse);
        String output= reverse();
        System.out.println(output);
    }
    static String reverse(){
        String output="";
        for(int i = "TODO".length()-1; i>=0; i--){
            output += "TODO".charAt(i);
        }
        return output ;
    }

}

