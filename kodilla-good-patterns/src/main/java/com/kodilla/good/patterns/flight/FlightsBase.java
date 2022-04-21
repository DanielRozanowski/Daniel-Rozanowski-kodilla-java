package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightsBase {
    private Set<Flight> flightSet = new HashSet<>();

    public Set<Flight> flightSet() {
        flightSet.add(new Flight("Gdańsk", "Wrocław"));
        flightSet.add(new Flight("Gdańsk", "Katowice"));
        flightSet.add(new Flight("Wrocław", "Gdańsk"));
        flightSet.add(new Flight("Warszawa", "Kraków"));
        flightSet.add(new Flight("Kraków", "Wrocław"));
        flightSet.add(new Flight("Radom", "Gdańsk"));
        flightSet.add(new Flight("Poznań", "Kraków"));

        return flightSet;
    }
}
