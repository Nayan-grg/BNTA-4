package com.bnta.week_four_wed.exercises.furtherMocking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person nana=new Person(1,"Nana",22);
//        PersonDAO personDAO=new PersonDataAccess();
//        PersonService personService=new PersonService(personDAO);
//        personService.savePerson(nana);
//        System.out.println(personService.getPeople());
//        personService.deletePerson(1);
//        System.out.println(personService.getPeople());

        PersonDAO personDAO1= new PersonFileDataAccessService();
        PersonService personService = new PersonService(personDAO1);
        Person Nayan = new Person(2,"Nayan",23);
        System.out.println(personService.getPeople());



    }
}
