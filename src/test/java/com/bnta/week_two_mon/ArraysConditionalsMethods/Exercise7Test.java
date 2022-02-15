package com.bnta.week_two_mon.ArraysConditionalsMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class Exercise7Test {
    private Exercise7 underTest;
    //Need to set this instance


    @BeforeEach
    void setUp() {
        underTest=new Exercise7();
        //this code of line will run before each method
        //this is important to do and will prevent you from rewriting each sentence

    }

    @Test
    void itCanReturnLongestString() {
        //Given ->create instances
        Exercise7 underTest =new Exercise7();
        String[] input={"Robyn","Alex","Michelle","Adib"};

        //When -> call the method
        String actual =underTest.findLongestString(input);

        //Then
        String expected="Michelle";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void itCanReturnTwoLongestString() {
        //Given ->create instances
        Exercise7 underTest =new Exercise7();
        String[] input={"Robyn","Alex","Michelle","Michella"};

        //When -> call the method
        String actual =underTest.findLongestString(input);

        //Then
        String expected="Michelle, Michella";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void canHandleEmptyString() {
        //Given ->create instances
        Exercise7 underTest =new Exercise7();
        String[] input={"Robyn","Alex","Michelle",null};

        //When -> call the method
        String actual =underTest.findLongestString(input);

        //Then
        String expected="Michelle";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void canHandleNull() {
        //Given ->create instances
        Exercise7 underTest =new Exercise7();
        String[] input=null;

        //When -> call the method
        String actual =underTest.findLongestString(input);

        //Then
        String expected="";
        assertThat(actual).isEqualTo(expected);

    }


    @Test
    void canHandleEmptyStrings() {
        //Given ->create instances
        String[] input={"","",""};

        //When -> call the method
        String actual =underTest.findLongestString(input);

        //Then
        String expected="";
        assertThat(actual).isEqualTo(expected);

    }


}