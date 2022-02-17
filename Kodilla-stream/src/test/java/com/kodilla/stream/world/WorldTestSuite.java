package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country countryOfNorthAmerica1 = new Country("USA", BigDecimal.valueOf(200000000));
        Country countryOfNorthAmerica2 = new Country("Canada", BigDecimal.valueOf(50000000));
        Country countriesOfAsia1 = new Country("China", BigDecimal.valueOf(2000000000));
        Country countriesOfAsia2 = new Country("Mongolia", BigDecimal.valueOf(4000000));

        final List<Country> countriesOfNorthAmerica = new ArrayList<>();
        countriesOfNorthAmerica.add(countryOfNorthAmerica1);
        countriesOfNorthAmerica.add(countryOfNorthAmerica2);

        final List<Country> countriesOfAsia = new ArrayList<>();
        countriesOfAsia.add(countriesOfAsia1);
        countriesOfAsia.add(countriesOfAsia2);

        Continent continent1 = new Continent("North America", countriesOfNorthAmerica);
        Continent continent2 = new Continent("Asia", countriesOfAsia);

        final List<Continent> continents = new ArrayList<>();
        continents.add(continent1);
        continents.add(continent2);

        World world = new World(continents);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = BigDecimal.valueOf(2254000000L);

        //Then
        Assertions.assertEquals(result, expected);
    }
}
