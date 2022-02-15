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
        File inputFile = new File("src/hello.txt");
        File tempFile = new File("myTempFile.txt");
        String currentLine;
        try {
            String lineToRemove = null;
            Scanner scanner=new Scanner(inputFile);
            while(scanner.hasNext()){
                String line=scanner.nextLine();
                String[] lineSplit = line.split(",");
                if(id==Integer.parseInt(lineSplit[0])){
                    lineToRemove=line;
                    break;
                }
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while ((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean successful = tempFile.renameTo(inputFile);





    }


    @Override
    public List<Person> getPeople() {
        try {
            File file =new File("src/hello.txt");
            List<Person> people=new ArrayList<>();
            Scanner scanner = new Scanner(file);
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
