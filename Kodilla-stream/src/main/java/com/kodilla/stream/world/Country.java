package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(final String name,final BigDecimal peopleQuantity) {
        this.countryName = name;
        this.peopleQuantity = peopleQuantity;
    }
    public String getCountryName() {
        return countryName;
    }
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
