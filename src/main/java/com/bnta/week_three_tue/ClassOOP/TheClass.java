package com.bnta.week_three_tue.ClassOOP;

import java.util.Arrays;
import java.util.Objects;

public class TheClass {
    //properties
    private String name;
    private int capacity;
    private Student[] students;
    //constructor
    public TheClass(String name, int capacity, Student[] students) {
        this.name = name;
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheClass theClass = (TheClass) o;
        return capacity == theClass.capacity && Objects.equals(name, theClass.name) && Arrays.equals(students, theClass.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capacity);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {
        return "TheClass{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", students=" + Arrays.toString(students) +
                '}';
    }


}
