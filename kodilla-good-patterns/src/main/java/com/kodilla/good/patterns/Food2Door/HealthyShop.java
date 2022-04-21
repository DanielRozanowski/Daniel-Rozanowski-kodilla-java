package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Deliverer {


    @Override
    public void processOrder(Order order) {
        System.out.println("Healthy shop is processing order");
    }
}
