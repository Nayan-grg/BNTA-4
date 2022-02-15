package com.bnta.week_four_wed.exercises.furtherMocking;

import java.util.ArrayList;
import java.util.List;

public class PersonListDataAccessService implements PersonDAO{

    //list is working as database
    static List<Person> people=new ArrayList<>();

    @Override
    public void savePerson(Person person) {

        if(person.getAge()==null || person.getId()==null || person.getName().length()==0){
            throw new IllegalStateException("Person cannot have empty fields");
        }
        boolean exists= doesPersonExist(person.getId());
        if(exists){
            throw new IllegalStateException("Person with id "+person.getId()+" already exists");
        }
        people.add(person);
    }

    public boolean doesPersonExist(int id){
        return people.stream().anyMatch(p->p.getId().equals(id));
    }

    @Override
    public void deletePerson(int id) {
        boolean exists=doesPersonExist(id);
        if(!exists){
            throw new IllegalStateException("person not found");
        }
       people.remove(getPersonById(id));


    }

    @Override
    public List<Person> getPeople() {
        return people;
    }


    @Override
    public Person getPersonById(int id) {
        for (Person person : people) {
            if(person.getId()==id){
                return person;
            }

        }return null;

        }
    }




