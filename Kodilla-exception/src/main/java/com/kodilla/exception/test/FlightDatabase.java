package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FlightDatabase {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinationList = new HashMap<>();

        destinationList.put("LA", true);
        destinationList.put("London", true);
        destinationList.put("Berlin", false);
        destinationList.put("Geneva", false);
        destinationList.put("Rome", true);
        destinationList.put("Cracow", true);
        destinationList.put("Budapest", false);

        if (destinationList.containsKey(flight.getArrivalAirport())) {
            return destinationList.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Flight doesn't exist!");
        }
    }
}