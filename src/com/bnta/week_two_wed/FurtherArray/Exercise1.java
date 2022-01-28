package com.bnta.week_two_wed.FurtherArray;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
//        int[] newArr= new int[3];
//        Arrays.fill(newArr,4);
//        newArr[1]=17;
////        System.out.println(Arrays.toString(newArr));
//        String[] anotherArr= {"hello","bye","why"};

//        //create a second array
//        String[] secondArr = Arrays.copyOf(anotherArr,anotherArr.length);
//         secondArr[0]="z";
//        System.out.println(Arrays.toString(secondArr));
//        System.out.println(Arrays.toString(anotherArr));

//        //7. Looping through an array
//
//        for (String s : secondArr) {
//            System.out.println(s);
//        }
//        for (String s : anotherArr) {
//            System.out.println(s);
//        }
        //8.Initialisation
        int[] Arr= new int[10];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]=i+1;
        }
        System.out.println(Arrays.toString(Arr));
//        looping through an array- reassignment
        for (int i = 0; i <10 ; i++) {
            Arr[i]=Arr[i]*2;

        }
        System.out.println(Arrays.toString(Arr));


    }
}
