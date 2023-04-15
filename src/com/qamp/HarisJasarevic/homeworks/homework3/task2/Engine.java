package com.qamp.HarisJasarevic.homeworks.homework3.task2;

public class Engine {

    protected double capacity;

    public Engine(final double capacity) {
        this.capacity = capacity;
    }

    public double increaseCapacity (final double increaseAmount) {
        return this.capacity += increaseAmount;
    }

    public double decreaseCapacity (final double decreaseAmount) {
        return this.capacity -= decreaseAmount;
    }

    @Override
    public String toString () {
        return "Capacity: {" + this.capacity + "}";
    }
}
