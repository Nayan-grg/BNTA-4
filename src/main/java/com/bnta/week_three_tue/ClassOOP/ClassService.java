package com.bnta.week_three_tue.ClassOOP;

public class ClassService {
    public void enrol(Student student, TheClass theClass) {
        //check the class capacity
        //check if the student in the class
        int capacity = theClass.getCapacity();
//        System.out.println(capacity);
        int count = 0;
        for (int i = 0; i < theClass.getStudents().length; i++) {
            if (theClass.getStudents()[i] != null) {
                count++;
            }
            if (count > 0) {
                if (theClass.getStudents()[i] == null) {
                    theClass.getStudents()[i] = student;
                    break;
                }
            }

                System.out.println(count);
            for (Student theClassStudent : theClass.getStudents()) {
                if (student.equals(student)) {
                    throw new IllegalStateException("already enrolled");
                }
            }
        }

    }
}
