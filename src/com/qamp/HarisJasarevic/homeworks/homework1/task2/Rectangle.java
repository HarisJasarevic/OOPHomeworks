package com.qamp.HarisJasarevic.homeworks.homework1.task2;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public final double getA() {
        return a;
    }

    public final void setA(final double a) {
        this.a = a;
    }

    public final double getB() {
        return b;
    }

    public final void setB(final double b) {
        this.b = b;
    }

    public final double getCircumference () {
        return (2 * a) + (2 * b);
    }

    public final double getArea () {
        return a * b;
    }

    public final boolean isSquare () {
        return a == b;
    }


}
