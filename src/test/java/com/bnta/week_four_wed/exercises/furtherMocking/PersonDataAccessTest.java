package com.bnta.week_four_wed.exercises.furtherMocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PersonDataAccessTest {
    private PersonDataAccess underTest;

    @BeforeEach
    void setUp() {
        List<Person> peopleList =new ArrayList<>();
        underTest=new PersonDataAccess();
    }

    @Test
    void savePerson() {
        //Given
        Person person =new Person(1,"Nayan",22);
        List<Person> testList=new ArrayList<>();

        //When
        testList.add(person);
        underTest.savePerson(person);

        //Then
        assertEquals(testList ,underTest.people);
    }

    @Test
    void cannotSavePersonWithNull() {
        //Given
        Person person =new Person(1,"",22);


        //When
        assertThatThrownBy(() ->underTest.savePerson(person)).hasMessage("Person cannot have empty fields");


    }

    @Test
    void cannotSavePersonThatAlreadyExist() {
        //Given
        //Given
        Person person =new Person(1,"Nayan",22);
        List<Person> testList=new ArrayList<>();

        //When
        testList.add(person);
        underTest.savePerson(person);


        //When
        assertThatThrownBy(() ->underTest.savePerson(person)).hasMessage("Person with id "+person.getId()+" already exists");


    }


    @Test
    void deletePerson() {
        //Given

        //When

        //Then
    }

    @Test
    void getPeople() {
        //Given

        //When

        //Then
    }

    @Test
    void getPersonById() {
        //Given

        //When

        //Then
    }




//
//    @Test
//    void doesPersonExist() {
//        //Given
//        Person person =new Person(1,"Nayan",22);
//        List<Person> testList=new ArrayList<>();
//
//        //When
//        testList.add(person);
//        underTest.doesPersonExist(1);
//
//        //Then
//        assertEquals(person,underTest.people.stream().anyMatch(person1 -> {
//            return person.getId().equals(1);
//        }));
//    }
}