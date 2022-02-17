package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    final List<Continent> continents;

    public World(final List<Continent> continents) {
        this.continents = continents;
    }
    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(countries -> countries.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}