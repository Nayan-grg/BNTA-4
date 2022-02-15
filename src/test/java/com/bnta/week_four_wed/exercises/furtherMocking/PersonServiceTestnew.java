package com.bnta.week_four_wed.exercises.furtherMocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PersonServiceTestNew {

    private PersonService underTest;
    private PersonDAO personDAO;

    @BeforeEach
    void setUp() {
        personDAO=mock(PersonDAO.class);
        underTest=new PersonService(personDAO);
    }

    
    @Test
    void savePerson() {
        //Given
        Person person=new Person(1,"Nana",22);
        //When
        underTest.savePerson(person);
        //then
        verify(personDAO).savePerson(person);

        //not sure about this
//        ArgumentCaptor<Person> argumentCaptor=ArgumentCaptor.forClass(Person.class);
//        verify(personDAO).savePerson(argumentCaptor.capture());
//        assertThat(argumentCaptor.getValue()).isEqualTo(person);
    }

    @Test
    void cannotSavePersonWithEmptyFields() {
        //Given
        Person person=new Person(0,"",22);
        //then
        assertThatThrownBy(() ->
                //when
                underTest.savePerson(person)).hasMessage("Person cannot have empty fields");
    }
    
    //nullTest

        @Test
    void canSavePersonWithPersonExist() {
        //Given
        List<Person> list=new ArrayList<>();
        Person person=new Person(1,"Nana",22);
//        Person person1=new Person(2,"Nayan",33);
        list.add(person);
        when(personDAO.getPeople()).thenReturn(list);

        //then
        assertThatThrownBy(() ->
                //when
                underTest.savePerson(person)).isInstanceOfAny(IllegalStateException.class).hasMessage("person with id "+person.getId()+" already exists");
    }
    
    @Test
    void deletePerson() {
        //given
        List<Person> list=new ArrayList<>();
        Person person=new Person(1,"Nana",22);
        list.add(person);
        when(personDAO.getPeople()).thenReturn(list);
        //when
        underTest.deletePerson(1);
        //then
        verify(personDAO).deletePerson(1);
    }
    
        @Test
    void cannotDeletePersonWithoutPerson(){

        int id =2;

        assertThatThrownBy(() -> {
            // When
            underTest.deletePerson(id);
        }).hasMessage("person with id " + id + " not found");
    }

    @Test
    void getPeople() {
        //Given
        List<Person> list=new ArrayList<>();
        //When
        when(personDAO.getPeople()).thenReturn(list);// this is used because not a void method

        //Then
        assertEquals(list,underTest.getPeople());
        verify(personDAO).getPeople();
    }

    @Test
    void getPersonById() {
        //Given
        List<Person> list=new ArrayList<>();
        Person person=new Person(1,"Nana",22);
        list.add(person);
        when(personDAO.getPeople()).thenReturn(list);
        //when
        underTest.getPersonById(1);

        //Then
        verify(personDAO).getPeople();
    }
}