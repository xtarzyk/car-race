package com.codecool.car_race;

import com.codecool.car_race.vehicles.Vehicle;
import java.util.LinkedList;
import java.util.List;


public class Race {

    private final List<Vehicle> vehicles = new LinkedList<>();

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
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
}
