package com.bnta.week_two_wed.FurtherArray;

import java.time.LocalDate;

public class Exercise10 {
    public static void main(String[] args) {
         String[] strArr= {"a","b","f"};
        String condition= "c";
        boolean hasC = false;
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals(condition)){
                hasC=true;
            }
        }
        System.out.println(hasC);


    }

}
