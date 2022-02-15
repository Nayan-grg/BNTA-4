package com.bnta.week_two_mon.ArraysConditionalsMethods;

import java.util.Scanner;

public class Exercise4{
    public static void main(String[] args) {
        primeOrNot(2);

    }
    static void primeOrNot(int input1) {
        if(input1<=2){
            throw new IllegalStateException("input invalid");
        }
        for(int i=2; i<input1;i++) {
            if(input1%i==0) {
                System.out.println(input1+" is not a prime number");
                break;
            }else if (i>input1-1){
                System.out.println(input1+"  is a prime number");
                break;
            }
            }

        }


    }








//    /*
//      Write a program that takes an input number from the console and prints if number is prime
//      Create a method to check if number is prime then use against the input
//    */
//    public static void main(String[] args) {
//        System.out.print("Enter a number");
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        Boolean isPrime= true;
//
//
//        for (int i = 2; i < n ; i++) {
//            if(n%i==0){
//                isPrime=false;
//                break;
//            }
//        }
//        if(isPrime){
//            System.out.println("Prime number");
//        }else{
//            System.out.println("Not a prime number");
//        }



    






