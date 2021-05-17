package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.util.RandomHelper;

public class Car extends Vehicle{
    /**
     * Create a car.
     * <p>
     * The call to the parent class' constructor has to be the first
     * thing the constructor does.  But we have to pass data to it.
     * We solve this by calling two static methods because both values
     * are calculated per instance.
     */
    public Car() {
        super(calculateNormalSpeed());
    }

    /**
     * The normal speed of the car determined by random.
     *
     * @return a value between 80 and 110 inclusive.
     */
    private static int calculateNormalSpeed() {
        return RandomHelper.nextInt(80, 110+1);
    }
    /**
     * List of names that cars can choose from.  It is a property of
     * all cars so it is made static.
     */
    private static final String[] POSSIBLE_NAMES = {
            "Epiphany",
            "Parallel",
            "Blitz",
            "Eos",
            "Evolution",
            "Wolf",
            "Union",
            "Empyrean",
            "Curiosity",
            "Gallop"
    };

    /**
     * Generate a name consisting of a first and last name chosen
     * from the list of allowed names.
     *
     * @return the generated name.
     */
    @Override
    protected String generateName() {
        String firstName = RandomHelper.chooseOne(POSSIBLE_NAMES);
        String lastName = RandomHelper.chooseOne(POSSIBLE_NAMES);
        return firstName + " " + lastName;
    }

    @Override
    public void prepareForLap(Race race) {

    }
}
