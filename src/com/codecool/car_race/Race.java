package com.codecool.car_race;

import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;
import java.util.LinkedList;
import java.util.List;


public class Race {

    private final List<Vehicle> vehicles = new LinkedList<>();
    static final int NUM_OF_LAPS = 50;

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
        for (int i = 0; i < NUM_OF_LAPS; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }

            // change weather and update broken truck status after the movement done
            weather.randomize();
            brokenTruck = getBrokenTruckStatus();
        }
    }

    /**
     * Update broken truck status through this method only
     * @return true if there is broken down truck on the track
     */
    private boolean getBrokenTruckStatus() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                if (truck.isBrokenDown()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        System.out.println("Race result:");
        vehicles.forEach(System.out::println);
    }


    public void registerRacer(Vehicle racer) {
        vehicles.add(racer);
    }

    /**
     * Weather can be different for races ongoing parallel so each race has a weather
     */
    private Weather weather = new Weather();

    /**
     * A proxy method for checking the weather through the Race object.
     *
     * @return true if it is raining.
     * @see Vehicle
     */
    public boolean isRaining() {
        return weather.isRaining();
    }

    /**
     * Store if there is a broken truck on the track. This boolean gets updated every turn
     */
    private boolean brokenTruck;

    /**
     * Returns if there is a broken truck on the track based on the brokenTruck field
     * @return true if there are any trucks that are broken down.
     */
    public boolean isYellowFlagActive() {
        return brokenTruck;
    }
}
