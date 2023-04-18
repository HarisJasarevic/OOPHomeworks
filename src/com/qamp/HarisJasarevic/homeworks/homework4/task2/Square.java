package com.qamp.HarisJasarevic.homeworks.homework4.task2;

public class Square extends Shape {

    private final double side;

    protected Square (final String color, final double side) {
        super(color);
        this.side = side;
    }

    @Override
    protected final double getArea () {
        return side * side;
    }

    @Override
    protected final double getCircumference() {
        return 4 * side;
    }
}
