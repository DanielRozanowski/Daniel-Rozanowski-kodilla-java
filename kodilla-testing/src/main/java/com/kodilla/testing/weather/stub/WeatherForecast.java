package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;

    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public Double calculateAverage(){

        Double average = 0.0;
        int n = 0;
        for(Double actualTemperature: temperatures.getTemperatures2()){
            average = average + actualTemperature;
            n++;
        }
        Double result = average / n;
        return result;
    }
    public Double calculateMedian(){
        ArrayList<Double> resultMedian = new ArrayList<>();


        for(Double actualTemperature: temperatures.getTemperatures2()){
            resultMedian.add(actualTemperature);

        }
        Collections.sort(Double);
        if (resultMedian.size()%2){
            Double median = 
        }
        return result;
    }





 }
