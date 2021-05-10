package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected final String name;
    protected final int normalSpeed;
    protected int actualSpeed;
    protected int distanceTravelled;

    protected Vehicle() {
        this.name = "Vehicle";
        this.normalSpeed = 100;
    }

    public abstract void  prepareForLap(Race race);

    public final void moveForAnHour() {
        distanceTravelled += actualSpeed;
    }
}
