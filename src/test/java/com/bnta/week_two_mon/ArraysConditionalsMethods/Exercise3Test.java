package com.bnta.week_two_mon.ArraysConditionalsMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {
    private Exercise3 underTest;

    @BeforeEach
    void setUp() {
        underTest=new Exercise3();
    }

    @Test
    void canTellIfEvenOrOdd() {
        //Given
        int input=3;

        //When
        boolean actual= underTest.isEven(input);

        //Then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }
}