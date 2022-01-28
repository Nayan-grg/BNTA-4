package com.bnta.week_two_wed.Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    // create a File object from a text file
    // create a Scanner object from out File object
    // create a loop which checks whether there is still some unused input
    // create a local variable which is assigned to the next line of the input
    // print the line to the console
    public static void main(String[] args) {
        File inputFile = new File("hello.txt");

        Scanner ourScanner = null;
        try {
            ourScanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(ourScanner.hasNext()) {
            String input = ourScanner.nextLine();
            System.out.println(input);
        }






        }
    }

