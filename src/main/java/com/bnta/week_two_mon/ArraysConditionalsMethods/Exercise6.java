package com.bnta.week_two_mon.ArraysConditionalsMethods;

import java.util.Scanner;

public class Exercise6 {

    /*
    Create a package called email
    Then have a method called validateEmail that return true of false if input is valid email
    Finally invoke validateEmail in main
    i.e. "hello@gmail.com" -> true
    i.e. "hellogmail.com" -> false
            */
    public static void main(String[] args) {

        System.out.println(validateEmail());
    }
    public static Boolean validateEmail(){
        Scanner sc= new Scanner(System.in);
        String inputEmail =sc.nextLine();
        boolean containIt = true;
        if(inputEmail.contains("@")){
            containIt=true;
            return containIt;
        }else{
            return false;
        }

    }






    }

