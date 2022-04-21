package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements Deliverer {

    @Override
    public void processOrder(Order order) {
        System.out.println("Gluten free shop is processing order");
    }
}
