package com.bnta.week_one_fri.JavaFundamentals;
public class Exercise5 {
    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac Exercise5.java | java Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // loop through args here
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
