package com.bnta.week_four_tue.exercises;

import java.util.*;

public class numberOfOccurrences {
    public static void main(String[] args) {

        //1.Split the string into a string[]
        String[] input= {"1","1","1","1","3","4","5","6","7","7","7","8","8"};
        //An array of string

        //countMap holds the count details of each element
        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < input.length; i++)
        {
            String key = input[i];
            if (countMap.containsKey(key))
            {
                int count = countMap.get(key);
                count++;
                countMap.put(key, count);
            } else
            //check if the map contains a key
            //if it doesn't contain a key, then add the key
            //if it contains the key, then you don't add the key
            {
                countMap.put(key, 1);
            }
        }
        System.out.println(countMap);


        //Popular number

        int popularNumber=0;
        for (Integer value : countMap.values()) {
            if(value>popularNumber){
                popularNumber=value;
            }

        }System.out.println(popularNumber);


    }
}
