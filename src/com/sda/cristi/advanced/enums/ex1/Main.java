package com.sda.cristi.advanced.enums.ex1;

/**
 * 1. Create enum Planet.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * 	E.g. „Huge Jupiter”, „Small Pluto”.
 * b)  Create distanceFromEarth method.
 * c) Verify both methods for multiple planets.
 */

public class Main {
    public static void main(String[] args) {
for(Planet planet: Planet.values()) {
    System.out.println(planet);
    System.out.println("Distance from terra: " + planet.getDistanceFromTerra());
}
    }
}
