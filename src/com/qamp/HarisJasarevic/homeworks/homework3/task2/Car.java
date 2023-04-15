package com.qamp.HarisJasarevic.homeworks.homework3.task2;

public class Car extends Vehicle {

    private final DieselEngine engine;

    protected Car (final String model, double engineCapacity) {
        super(model);
        this.engine = new DieselEngine(engineCapacity);
    }

    @Override
    public void accelerate (double speed) {
        double fuelConsumed = 0.2 * speed;
        if (fuelConsumed <= this.engine.getCapacity()) {
            super.accelerate(speed);
            this.engine.decreaseCapacity(fuelConsumed);
        }
    }
    @Override
    public void decelerate (final double speed) {
        super.decelerate(speed);
    }

    @Override
    public String toString() {
        return super.toString() + ", Diesel Engine " + this.engine.toString();
    }
}
