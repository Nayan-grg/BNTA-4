package com.bnta.week_four_wed.exercises.furtherMocking;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonFileDataAccessService implements PersonDAO {

    @Override
    public void savePerson(Person person) {
        try {
            File file = new File("src/hello.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(person.getId() + "," + person.getName() + "," + person.getAge());

            // once you are done writing to the file
            printWriter.flush();
            printWriter.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void deletePerson(int id) {

    }


    @Override
    public List<Person> getPeople() {
        File file =new File("src/hello.txt");
        Scanner scanner= null;
        try {
            List<Person> people=new ArrayList<>();
            scanner = new Scanner(file);
            while(scanner.hasNext()){
                String[] line = scanner.nextLine().split(",");
                Person person=new Person(Integer.parseInt(line[0]),line[1], Integer.parseInt(line[2]));
                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
