package com.qamp.HarisJasarevic.homeworks.homework4.task1;

public class Duck implements Interfaces.Swim, Interfaces.Flight {

    @Override
    public String swim () {
        return "Duck - Kinda floats!";
    }

    @Override
    public String fly () {
        return "Duck - Flies with wings!";
    }
}
