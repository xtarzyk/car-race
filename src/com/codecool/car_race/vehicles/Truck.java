package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.util.RandomHelper;

public class Truck extends Vehicle{

    private static final int NORMAL_SPEED = 100;

    public Truck() {
        super(NORMAL_SPEED);
    }
    /**
     * Generate name by converting a random integer to string
     *
     * @return the name of the truck
     */
    @Override
    protected String generateName() {
        return Integer.toString(RandomHelper.nextInt(1001));
    }

    @Override
    public void prepareForLap(Race race) {

    }
}
