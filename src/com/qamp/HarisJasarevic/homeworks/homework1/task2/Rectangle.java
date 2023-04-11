package com.qamp.HarisJasarevic.homeworks.homework1.task2;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(final double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(final double b) {
        this.b = b;
    }

    public double getCircumference () {
        return (2 * a) + (2 * b);
    }

    public double getArea () {
        return a * b;
    }

    public boolean isSquare () {
        return a == b;
    }


}
