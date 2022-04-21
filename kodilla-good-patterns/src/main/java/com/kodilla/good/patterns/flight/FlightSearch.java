package com.kodilla.good.patterns.flight;

public class FlightSearch {
    private FlightsBase flightbase = new FlightsBase();

    public void searchToArrivalAirport(String airport) {
        System.out.println("Searching for flights to arrival airport: ");
        flightbase.flightSet().stream()
                .filter(a -> a.getArrivalAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void searchDepartureFromAirport(String airport) {
        System.out.println("Searching for flights from departure airport: ");
        flightbase.flightSet().stream()
                .filter(a -> a.getDepartureAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void searchWithStopoverFlight(String airport1, String airport2, String airport3) {
        System.out.println("Searching for a flight with a stopover: ");

        flightbase.flightSet().stream()
                .filter(a -> a.getDepartureAirport().equals(airport1))
                .filter(a -> a.getArrivalAirport().equals(airport2))
                .forEach(System.out::println);

        flightbase.flightSet().stream()
                .filter(a -> a.getDepartureAirport().equals(airport2))
                .filter(a -> a.getArrivalAirport().equals(airport3))
                .forEach(System.out::println);
    }
}

