package com.bnta.week_two_wed.EnumDateseExceptions;

public class Exercise1_2_3 {

    public static void main(String[] args) {
        ShirtSize size = ShirtSize.S;
        for (ShirtSize element:ShirtSize.values()) {
            String newStr =element.name();
            String lowerCase=newStr.toLowerCase();
            System.out.println(lowerCase);
        }




    }

}
