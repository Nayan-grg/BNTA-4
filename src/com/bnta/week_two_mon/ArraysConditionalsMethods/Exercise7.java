package com.bnta.week_two_mon.ArraysConditionalsMethods;
//
public class Exercise7 {
//    /*
//        Write a method that finds the longest string in any given array.
//        i.e. [] -> ""
//        i.e. ["hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
//    */
    public static void main(String[] args) {

        String[] stringArray = {"hello", "ola", "bye", "ciao", "bingo", "okays", "windows"};
        System.out.println(findLongestString(stringArray));
    }

    static String findLongestString(String[] strArray){
        //First loop through array
        // Find length of each string
        // Compare it - if longer store

        String longestStr = strArray[0];
        int longestStrLength = strArray[0].length();
//        System.out.println(longestStrLength);

        for (int i = 1; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
            if (longestStrLength<strArray[i].length()){
                longestStr = strArray[i];
                longestStrLength = strArray[i].length();

            } else if (longestStrLength == strArray[i].length()){
                longestStr = longestStr + ", " + strArray[i];
            }

        }

        return longestStr;
    }
}




