package com.qamp.HarisJasarevic.homeworks.task2;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Circumference = " + rectangle.getCircumference() +
                "\n" + "Area = " + rectangle.getArea() +
                "\n" + "Is Square = " + rectangle.isSquare());
    }

}
