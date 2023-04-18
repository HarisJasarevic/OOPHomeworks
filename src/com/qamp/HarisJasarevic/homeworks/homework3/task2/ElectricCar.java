package com.qamp.HarisJasarevic.homeworks.homework3.task2;

public class ElectricCar extends Vehicle {

    private final ElectricEngine engine;

    protected ElectricCar (final String model, double engineCapacity) {
        super(model);
        this.engine = new ElectricEngine(engineCapacity);
    }

    @Override
    public void accelerate(final double acceleration) {
        double batteryCapacity = 0.4 * speed;
        if (batteryCapacity <= this.engine.getCapacity()) {
            super.accelerate(acceleration);
            this.engine.decreaseCapacity(batteryCapacity);
        }
    }
    public void decelerate (final double speed) {
        super.decelerate(speed);
        this.engine.brake(speed);
    }
    @Override
    public String toString () {
        return super.toString() + ", Electric Engine " + this.engine.toString();
    }
}
