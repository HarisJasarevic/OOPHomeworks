package com.qamp.HarisJasarevic.homeworks.homework3.task2;

public class Vehicle {

    protected double speed;
    protected final String model;

    public Vehicle(final String model) {
        this.model = model;
        this.speed = 0.0;
    }

    public void accelerate(final double acceleration) {
        this.speed += acceleration;
    }

    public void decelerate(final double deceleration) {
        if (this.speed - deceleration < 0) {
            this.speed = 0.0;
        } else {
            this.speed -= deceleration;
        }
    }

    @Override
    public String toString () {
        return "Vehicle: {" + this.model + "}, Speed: {" + this.speed + "}";
    }
}
