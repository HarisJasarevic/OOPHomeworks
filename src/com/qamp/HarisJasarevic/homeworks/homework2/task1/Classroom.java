package com.qamp.HarisJasarevic.homeworks.homework2.task1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Student> students;

    public Classroom() {
        this.students= new ArrayList<>();
    }

    public void addStudent(final Student student) {
        this.students.add(student);
    }

    public boolean isPresent(final String name) {
        for (final Student student : this.students) {
           if (student.getName().equals(name)) {
               return true;
           }
        }
        return false;
    }

    public void printClassroom () {
        for (final Student student : students) {
            System.out.println(student.toString());
        }
    }
}



