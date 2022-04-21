package com.kodilla.good.patterns.flight;

public class Application {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        flightSearch.searchDepartureFromAirport("Gdańsk");
        flightSearch.searchToArrivalAirport("Wrocław");
        flightSearch.searchWithStopoverFlight("Kraków", "Wrocław", "Gdańsk");
    }
}
