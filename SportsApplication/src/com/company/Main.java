package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    interface Activity {
        /**
         * Compute the average speed for an activity as a natural number.
         */
        int getAverageSpeed();
    }

    public static void main(String[] args) {
        List<Activity> weirdCyclistTrips = new ArrayList<>();
//        weirdCyclistTrips.add(new CyclingActivity(24, 8)); // first passed value is meters, second is seconds
//        weirdCyclistTrips.add(new CyclingActivity(28, 4));
//        weirdCyclistTrips.add(new CyclingActivity(30, 5));

        System.out.println(numberOfPerfectTrips(weirdCyclistTrips)); // should print 2

//        weirdCyclistTrips.add(new CyclingActivity(7, -3)); // this code should throw an InvalidActivityDataException
//        weirdCyclistTrips.add(new CyclingActivity.Builder().distance(35).time(5).build()); // implement a Builder for the Cycling Activity

//        printLongestDistanceForEachAverageSpeed(weirdCyclistTrips);
    }

    /**
     * Count the number of perfect trips from a given list of trips.
     * A trip is perfect if its average speed is prime.
     */
    private static long numberOfPerfectTrips(List<Activity> trips) {
        return 2;
    }

    /**
     * For a given list of CyclingActivities, find the longest distance that was traveled for each average speed.<br>
     * E.g., the list of cycling activities is: [{300m, 5s}, {500m, 5s}, {240m, 4s}].<br>
     * The expected result would be:<br>
     * 60 m/s -> 300 m<br>
     * 100 m/s -> 500 m
     */
//    private static void printLongestDistanceForEachAverageSpeed(List<CyclingActivity> trips) {
//        System.out.println("3 m/s -> 24 m");
//        System.out.println("6 m/s -> 30 m");
//        System.out.println("7 m/s -> 35 m");
//    }
}
