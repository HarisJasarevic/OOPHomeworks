package com.qamp.HarisJasarevic.homeworks.homework3.task2;

public class ElectricEngine extends Engine{

    public ElectricEngine (final double capacity) {
        super(capacity);
    }

    public double getCapacity () {
        return capacity;
    }

    public void brake (final double brakeSpeed) {
        this.increaseCapacity(0.1 * brakeSpeed);
    }
}
