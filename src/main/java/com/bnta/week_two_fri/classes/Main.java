package com.bnta.week_two_fri.classes;

import com.bnta.week_two_fri.classes.Email.EmailValidator;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Opening file
        File file= new File("src/data.txt");
        List<String> lines = new ArrayList<>();
        try (Scanner scan1 = new Scanner(file)) {
            while (scan1.hasNext())
                lines.add(scan1.next());
        }
        System.out.println(lines);

        //Creating person
        Person person1= new Person("Ani","Singh","female",LocalDate.of(1999, Month.JANUARY,9));
        Person person2=new Person("John","Turner","Male",LocalDate.of(2000,Month.APRIL,3));

        //Checking if emailValidator works
        EmailValidator email1= new EmailValidator();
        System.out.println(email1.validateEmail("hello@.com"));
    }
}
