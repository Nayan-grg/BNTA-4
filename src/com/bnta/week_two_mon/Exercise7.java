package com.bnta.week_two_mon;
//
//public class Exercise7 {
//    /*
//        Write a method that finds the longest string in any given array.
//        i.e. [] -> ""
//        i.e. ["hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
//    */
//    public static void main(String[] args) {
//
//        //First loop through array
//
//        // Find length of each string
//        // Compare it - if longer store
//        String[] stringArray = {"hello", "ola", "bye", "ciao", "bingo", "okays", "windows"};
//        System.out.println(findLongestString(stringArray));
//
//    }
//
//    static String findLongestString(String[] strArray){
//
//        String longestStr = strArray[0];
//        int longestStrLength = strArray[0].length();
////        System.out.println(longestStrLength);
//
//        for (int i = 1; i < strArray.length; i++) {
////            System.out.println(strArray[i]);
//            if (longestStrLength<strArray[i].length()){
//                longestStr = strArray[i];
//                longestStrLength = strArray[i].length();
//
//            } else if (longestStrLength == strArray[i].length()){
//                longestStr = longestStr + ", " + strArray[i];
//            }
//
//        }
//
//        return longestStr;
//    }
//}
//
//
//
//
//import java.util.Arrays;
//
//public class Exercise7 {
//    /*
//        Write a method that finds the longest string in any given array.
//        i.e. [] -> ""
//        i.e. ["hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
//        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
//    */
//    public static void main(String[] args) {
//        String[] aString ={"hello", "bingo", "ola", "bye", "ciao","bingo"};
//        String c=findLongestString(aString);
//        System.out.println(c);
//    }
//    public static String findLongestString(String[] anyArr) {
//
//        String firstString = null;
//        for (int i = 1; i < anyArr.length; i++) {
//            firstString = anyArr[0];
//            if (anyArr[i].length() > firstString.length()) {
//                firstString = anyArr[i];
//            } else if (anyArr[i].length() == firstString.length()) {
//                firstString = anyArr[i] + "," + firstString;
//            }
//
//        }
//        return firstString;
//
//    }
//}
