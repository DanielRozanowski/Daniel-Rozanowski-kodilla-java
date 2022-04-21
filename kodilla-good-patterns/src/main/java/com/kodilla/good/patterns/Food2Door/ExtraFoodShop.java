package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Deliverer {


    @Override
    public void processOrder(Order order) {
        System.out.println("Extra food shop is processing order");
    }
}