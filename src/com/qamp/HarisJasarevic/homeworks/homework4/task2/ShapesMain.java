package com.qamp.HarisJasarevic.homeworks.homework4.task2;

import java.util.ArrayList;
import java.util.List;

public class ShapesMain {

    public static void main(String[] args) {

        final List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Black", 3));
        shapes.add(new Square("Yellow", 5));
        shapes.add(new Rectangle("Pink", 3,4));

        for (final Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
