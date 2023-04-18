package com.qamp.HarisJasarevic.homeworks.homework4.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlyersAndSwimmersMain {

    public static void main(String[] args) {

        final Fish fish = new Fish();
        final Plane plane = new Plane();
        final Duck duck = new Duck();
        final Pegasus pegasus = new Pegasus();
        final Submarine submarine = new Submarine();

        final List<Interfaces.Flight> flyers = new ArrayList<>();
        flyers.add(plane);
        flyers.add(duck);
        flyers.add(pegasus);

        final List<Interfaces.Swim> swimmers = new LinkedList<>();
        swimmers.add(fish);
        swimmers.add(duck);
        swimmers.add(submarine);

        for (Interfaces.Flight flyer : flyers) {
            System.out.println(flyer.fly());
        }

        for (Interfaces.Swim swimmer : swimmers) {
            System.out.println(swimmer.swim());
        }
    }
}
