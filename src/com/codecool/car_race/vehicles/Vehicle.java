package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected final String name;
    protected final int normalSpeed;
    protected int actualSpeed;
    protected int distanceTravelled;

    /**
     * Create a vehicle with the given name and normal speed.
     * NOTE: normalSpeed could also have a setter method like generateName(),
     * that would have been a good solution too
     */
    protected Vehicle() {
        this.name = generateName();
        this.normalSpeed = 100;
    }
    /**
     * child classes should implement naming inside this method
     *
     * @return name of vehicle
     */
    protected abstract String generateName();

    public abstract void  prepareForLap(Race race);

    public final void moveForAnHour() {
        distanceTravelled += actualSpeed;
    }

    /**
     * Return the textual representation of this vehicle.
     */

    public String toString() {
        StringBuilder sb = new StringBuilder("{")
                .append("Distance travalled: ")
                .append(distanceTravelled)
                .append(", ")
                .append("type: ")
                .append(getClass().getSimpleName())
                .append(", ")
                .append("name: ")
                .append(name)
                .append("}");
        return sb.toString();
    }
}
