package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        // dummy data
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.2);
        stubResult.put("Gdansk", 26.1);

        return stubResult;
    }

    @Override
    public ArrayList<Double> getTemperatures2() {
        ArrayList<Double> temperaturesArray = new ArrayList<>();
        temperaturesArray.add(25.5);
        temperaturesArray.add(30.0);
        temperaturesArray.add(22.4);
        temperaturesArray.add(23.5);
        return temperaturesArray;
    }


}