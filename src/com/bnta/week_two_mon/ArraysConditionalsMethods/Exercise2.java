package com.bnta.week_two_mon.ArraysConditionalsMethods;

import java.util.Arrays;

public class Exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String str = "   b ri   ght net   work  ";
        str= str.trim();
        str = str.replaceAll("\\s+", "");
        str = str.substring(0,6)+" "+ str.substring(6,13);
        System.out.println(str);
        }

    }
