package com.bnta.week_two_wed.EnumDateseExceptions;

import java.time.LocalDate;

public class Exercise4_5 {
    public static void main(String[] args) {
//        LocalDateTime ld= LocalDateTime.now();
//        System.out.println(ld);
        LocalDate dob=LocalDate.of(1999,4,8);
//        System.out.println(dob);
//        int getYear = LocalDate.now().getYear();
//        System.out.println(getYear);
        calculateAge(dob);

    }
    public static void calculateAge(LocalDate someDay){
        int getYear = LocalDate.now().getYear();
        int Age = getYear-someDay.getYear();
        System.out.println(Age);
    }

}
