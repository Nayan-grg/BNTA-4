package com.bnta.week_four_wed.exercises.furtherMocking;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
        void savePerson(Person person);
        void deletePerson(int id);
        List<Person> getPeople();
        Person getPersonById(int id);
}
