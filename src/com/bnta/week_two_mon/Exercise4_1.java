package com.bnta.week_two_mon;

import java.util.Scanner;

//Create a method to check if number is prime then use against the input
public class Exercise4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        checkPrime(input);
    }
    public static void checkPrime(int n){
        Boolean isPrime= true;
        for(int i =2; i<n ;i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
            }
        if(isPrime){
            System.out.println("prime number");

        }
    }


}
