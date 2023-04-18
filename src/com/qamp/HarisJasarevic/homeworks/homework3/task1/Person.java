package com.qamp.HarisJasarevic.homeworks.homework3.task1;

public class Person {

    protected final String name;

    public Person (final String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Name: {" + this.name + "}";
    }
}
