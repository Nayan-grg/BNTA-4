package com.bnta.week_two_mon.ArraysConditionalsMethods;

import java.util.Scanner;

public class Exercise3 {
    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */

    public static void main(String[] args) {
            evenOdd(33);
    }
    static void evenOdd(int x){
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}