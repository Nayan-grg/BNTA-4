package com.bnta.week_four_wed.exercises.furtherMocking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person nana=new Person(1,"Nana",22);
        PersonDAO personDAO1= new PersonFileDataAccessService();
        PersonService personService = new PersonService(personDAO1);
//        personService.savePerson(nana);
//        System.out.println(personService.getPeople());;
//        System.out.println(personService.getPersonById(1));;
//        personService.deletePerson(1);





    }
}
