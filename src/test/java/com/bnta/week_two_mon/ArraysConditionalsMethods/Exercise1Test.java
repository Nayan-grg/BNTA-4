package com.bnta.week_two_mon.ArraysConditionalsMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    private Exercise1 underTest;

    @BeforeEach
    void setUp() {
        underTest=new Exercise1();
    }

    @Test
    void canReverseString() {
        //Given
        String output="hello";
        //When
        String actual=underTest.reverse(output);
        //Then
        String expected="olleh";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleNullInput() {
        //Given
        String input=null;
        //When
        String actual=underTest.reverse(input);
        //Then
        String expected=null;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleEmptyString() {
        //Given
        String input="";
        //When
        String actual=underTest.reverse(input);
        //Then
        String expected="";
        assertThat(actual).isEqualTo(expected);
    }
}