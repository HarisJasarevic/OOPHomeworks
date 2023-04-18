package com.qamp.HarisJasarevic.homeworks.homework3.task2;

public class VehiclesMain {

    public static void main(String[] args) {

        final Car car = new Car ("Mercedes GLK 350 CDI", 100);
        System.out.println(car.toString());

        car.accelerate(130);
        car.decelerate(20);
        System.out.println(car.toString());

        final ElectricCar electricCar = new ElectricCar ("Mercedes S 63 AMG", 200);
        electricCar.accelerate(180);
        electricCar.decelerate(30);
        System.out.println(electricCar.toString());

    }
}
