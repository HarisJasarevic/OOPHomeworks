package com.qamp.HarisJasarevic.homeworks.homework4.task2;

public abstract class Shape {

    private final String color;

    protected Shape(final String color) {
        this.color = color;
    }

    private String getColor () {
        return color;
    }
    protected abstract double getArea ();
    protected abstract double getCircumference ();

    public final String toString () {
        return "Color: {" + getColor() + "}" + ", Area: {" + getArea() + "}" + ", Circumference: {" + getCircumference() + "}";
    }
}
