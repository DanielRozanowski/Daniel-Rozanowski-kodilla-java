package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();

        Flight flight = new Flight("LA", "London");
        Flight nextFlight = new Flight("Rome", "Geneva");
        Flight errFlight = new Flight("Rome", "XYZ");

        try {
            System.out.println(flightDatabase.findFlight(flight));
            System.out.println(flightDatabase.findFlight(nextFlight));
            System.out.println(flightDatabase.findFlight(errFlight));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight doesn't exist");
        }
    }
}

