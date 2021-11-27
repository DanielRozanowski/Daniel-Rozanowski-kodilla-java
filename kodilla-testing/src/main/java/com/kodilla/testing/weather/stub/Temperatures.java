package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Map;

public interface Temperatures {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees
    Map<String, Double> getTemperatures();

    ArrayList<Double> getTemperatures2();
}

