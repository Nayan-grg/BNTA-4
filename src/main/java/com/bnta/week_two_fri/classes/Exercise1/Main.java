package com.bnta.week_two_fri.classes.Exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        Person p7 = new Person();
        Person p8 = new Person();
        Person p9 = new Person();
        Person p10 = new Person();
        Person p11 = new Person();
        Person p12 = new Person();
        Person p13 = new Person();
        Person p14 = new Person();
        Person p15 = new Person();
        Person p16 = new Person();
        Person p17 = new Person();
        Person p18 = new Person();
        Person p19 = new Person();
        Person p20 = new Person();
        Person[] people = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19};
        storeData(people);


    }

    public static void storeData(Person[] person) throws FileNotFoundException {
        File file = new File("src/file.txt");
        Scanner scanner = new Scanner(file);
        String lines = scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
//            System.out.println(line);
            for (Person value : person) {
                String[] array = line.split(",");
                value.setId(array[0]);
                value.setFirstName(array[1]);
                value.setLastName(array[2]);
                value.setEmail(array[3]);
                value.setGender(array[4]);
            }
            System.out.println(Arrays.toString(person));
        }

    }

}