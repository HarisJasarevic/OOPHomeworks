package com.qamp.HarisJasarevic.homeworks.homework1.task3;

public class ComplexMain {

    public static void main(String[] args) {

        Complex z1 = new Complex(2,3);
        Complex z2 = new Complex(4,5);

        Complex sum = z1.addNumbers(z2);

        Complex division = z1.subtractNumbers(z2);

        z1.printComplex();
        z2.printComplex();
        sum.printComplex();
        division.printComplex();
    }
}
