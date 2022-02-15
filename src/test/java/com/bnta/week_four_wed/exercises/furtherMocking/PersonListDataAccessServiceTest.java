package com.bnta.week_four_wed.exercises.furtherMocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

class PersonListDataAccessServiceTest {

    private PersonListDataAccessService underTest;

    @BeforeEach
    void setUp() {
        underTest =new PersonListDataAccessService();
    }

    @Test
    void savePerson() {
        //Given
        Person person=new Person(3,"Nayan",22);
        //When
        underTest.savePerson(person);
        //Then
        assertThat(person).isIn(PersonListDataAccessService.people);

    }

    @Test
    void savePersonWithEmptyFields(){
        //Given
        Person person=new Person(1,"",22);

        //Then
        assertThatThrownBy(()->
                //When
        {underTest.savePerson(person);}).hasMessage("Person cannot have empty fields");
    }

    @Test
    void cannotSavePersonIfPersonExist() {

        //Given
        Person person=new Person(1,"Nana",22);
        PersonListDataAccessService.people.add(person);

        //then
        assertThatThrownBy(() ->
                //when
                underTest.savePerson(person)).isInstanceOfAny(IllegalStateException.class).hasMessage("Person with id "+person.getId()+" already exists");
    }

    @Test
    void canDeletePerson() {
        //Given
        Person person=new Person(1,"Nana",22);
        PersonListDataAccessService.people.add(person);

        //When
        underTest.deletePerson(person.getId());
        //Then
        assertThat(PersonListDataAccessService.people).doesNotContain(person);
    }

    @Test
    void cannotDeletePersonIfDoesNotExist() {
            int id =2;

            assertThatThrownBy(() -> {
                // When
                underTest.deletePerson(id);
            }).hasMessage("person not found");
        }


    @Test
    void getPeople() {
        //Given

        //When
        underTest.getPeople();

        //Then
        assertThat(PersonListDataAccessService.people).isEqualTo(underTest.getPeople());
    }

    @Test
    void getPersonById() {
        //Given
        Person person=new Person(1,"Nana",22);
        PersonListDataAccessService.people.add(person);

        //When
        underTest.getPersonById(1);
        //Then
        assertThat(person).isEqualTo(underTest.getPersonById(1));
    }

    @Test
    void cannotGetPersonByIdIfNotInList(){
        Person expected= null;
        Person actual=underTest.getPersonById(4);
        assertThat(actual).isEqualTo(expected);
    }
}