package com.kodilla.good.patterns.Food2Door;

public class Food2Door {

    public void processOrder(Order order) {
        Deliverer deliverer = getDeliverer(order.getDeliverer());
        deliverer.processOrder(order);
    }

    private Deliverer getDeliverer(String deliverer) {
        if(deliverer.equals("ExtraFoodShop"))
            return new ExtraFoodShop();
        if(deliverer.equals("GlutenFreeShop"))
            return new GlutenFreeShop();
        if(deliverer.equals("HealthyShop"))
            return new HealthyShop();
        return null;
    }
}
