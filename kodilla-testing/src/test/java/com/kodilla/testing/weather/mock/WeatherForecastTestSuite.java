package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.Test;                                            // [5]

import static org.mockito.Mockito.mock;                                       // [6]

class WeatherForecastTestSuite {                                              // [7]

    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);               // [10]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }                                                                          // [14]
}
