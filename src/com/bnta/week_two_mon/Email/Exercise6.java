package com.bnta.week_two_mon.Email;

public class Exercise6 {
    /*
    Create a package called email
    Then have a method called validateEmail that return true of false if input is valid email
    Finally invoke validateEmail in main
    i.e. "hello@gmail.com" -> true
    i.e. "hellogmail.com" -> false
            */
    public static void main(String[] args) {
        //Creating a method
        String email1="gwegrf";
        System.out.println(validateEmail(email1));
    }
    public static boolean validateEmail(String email){
      Boolean validate= true;
        if (email.contains("@")){
            validate=true;
        }else{
            validate=false;
        }
        return validate;
    }
}
