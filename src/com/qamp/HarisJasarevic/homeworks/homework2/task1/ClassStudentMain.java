package com.qamp.HarisJasarevic.homeworks.homework2.task1;

public class ClassStudentMain {

    public static void main(String[] args) {

        Classroom classroom = new Classroom();

        Student student1 = new Student("Omer ");
        Student student2 = new Student("Anto ", 23);

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        classroom.printClassroom();

    }
}
