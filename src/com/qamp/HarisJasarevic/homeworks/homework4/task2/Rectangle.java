package com.qamp.HarisJasarevic.homeworks.homework4.task2;

public class Rectangle extends Shape {

    private final double a;
    private final double b;

    protected Rectangle (final String color, final double a, final double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    protected final double getArea () {
        return a * b;
    }

    @Override
    protected final double getCircumference() {
        return 2 * (a + b);
    }
}
