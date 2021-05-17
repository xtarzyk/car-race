package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public class Motorcycle extends Vehicle{
    private static final int NORMAL_SPEED = 100;

    public Motorcycle() {
        super(NORMAL_SPEED);
    }
    /**
     * Motorcycles have names with serial numbers.  We have to track
     * the numbering on a class level that's why this field is static.
     */
    private static int motorcycleNumber = 1;

    /**
     * Generate name using the 'Motorcycle' and a number
     *
     * @return the name of the motorcycle
     */
    @Override
    protected String generateName() {
        return "Motorcycle " + motorcycleNumber++;
    }

    @Override
    public void prepareForLap(Race race) { }


}
