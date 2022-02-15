package com.bnta.week_four_wed.exercises.furtherMocking;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PersonServiceTest {
    private PersonService underTest;
    private PersonDAO personDAO;

    @BeforeEach
    void setUp() {
        personDAO=mock(PersonDAO.class);
        underTest=new PersonService(personDAO);
    }

    @Test
    void canSavePerson() {
        //Given
        Person person=new Person(1,"Nana",22);
        //When
        underTest.savePerson(person);
        //then
        ArgumentCaptor<Person> argumentCaptor=ArgumentCaptor.forClass(Person.class);
        verify(personDAO).savePerson(argumentCaptor.capture());
        assertThat(argumentCaptor.getValue()).isEqualTo(person);
    }

    @Test
    void canSavePersonWithEmptyField() {
        //Given
        Person person=new Person(0,"",22);

        //then
        assertThatThrownBy(() ->
                //when
                underTest.savePerson(person)).hasMessage("Person cannot have empty fields");
    }

    @Test
    void canSavePersonWithPersonExist() {

        //Given
        List<Person> list=new ArrayList<>();
        Person person=new Person(1,"Nana",22);
        Person person1=new Person(2,"rishi",33);
        list.add(person);
        when(personDAO.getPeople()).thenReturn(list);

        //then
        assertThatThrownBy(() ->
                //when
                underTest.savePerson(person)).isInstanceOfAny(IllegalStateException.class).hasMessage("person with id "+person.getId()+" already exists");
    }

    @Test
    void canGetPeople() {
        //Given
        List<Person> list=new ArrayList<>();
        //When
        when(personDAO.getPeople()).thenReturn(list);// this is used because not a void method

        //Then
        assertEquals(list,underTest.getPeople());
        verify(personDAO).getPeople();
    }
    @Test
    void canDeletePersonWithoutPerson(){

        assertThatThrownBy(() -> {
            // When
            underTest.deletePerson(2);
        }).hasMessage("person not found");
    }

    @Test
    void canDeletePerson(){
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


}