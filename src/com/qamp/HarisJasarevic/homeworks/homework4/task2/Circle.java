package com.qamp.HarisJasarevic.homeworks.homework4.task2;

public class Circle extends Shape {

    private final double radius;

    protected Circle (final String color, final double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    protected final double getArea () {
        return radius * radius * Math.PI;
    }

    @Override
    protected final double getCircumference () {
        return 2 * radius * Math.PI;
    }
}
