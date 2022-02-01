package com.bnta.week_one_fri.JavaFundamentals;

public class Exercise4 {
    public static void main(String[] args) {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] strArray= input.split(", ");
        double result=0;
        for (int i = 0; i < strArray.length; i++) {
            double change = Double.parseDouble(strArray[i]);
            result = result + change;
        }
        System.out.println(result);

    }
}

