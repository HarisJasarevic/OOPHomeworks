package com.qamp.HarisJasarevic.homeworks.homework2.task1;

public class Student {

    private final String name;
    private final int age;

    public Student (final String name) {
        this.name = name;
        this.age = 15;
    }

    public Student (final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return age;
    }

    public final String toString () {
        return "Name: " + name + "Age: " + age;
    }
}
