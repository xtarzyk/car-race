package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.util.RandomHelper;

public class Truck extends Vehicle{
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
