package com.kodilla.testing.weather.stub;

import java.util.*;

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
        for(Double actualTemperature: temperatures.getTemperatures().values()){
            average = average + actualTemperature;
            n++;
        }
        Double result = average / n;
        return result;
    }
    public Double calculateMedian(){
        ArrayList<Double> resultMedian = new ArrayList<>();


        for(Double actualTemperature: temperatures.getTemperatures().values()){
            resultMedian.add(actualTemperature);

        }
        Collections.sort(resultMedian);
        if (resultMedian.size()%2 == 0){
            double a = resultMedian.get(resultMedian.size()/2);
            double b = resultMedian.get((resultMedian.size()/2) +1);
            double median = (a + b)/ 2.0;
            return median;
        }
        else{
            double median = resultMedian.get(resultMedian.size()/2);
            return median;
        }

    }





 }
