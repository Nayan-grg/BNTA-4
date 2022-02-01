package com.bnta.week_three_tue.ClassOOP;

import java.util.Objects;

public class Enrollment {
    //Properties
    private Student student;
    private TheClass theclass;
    //constructor
    public Enrollment(Student student, TheClass theclass) {
        this.student = student;
        this.theclass = theclass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public TheClass getTheclass() {
        return theclass;
    }

    public void setTheclass(TheClass theclass) {
        this.theclass = theclass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return Objects.equals(student, that.student) && Objects.equals(theclass, that.theclass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, theclass);
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student +
                ", theclass=" + theclass +
                '}';
    }

}
