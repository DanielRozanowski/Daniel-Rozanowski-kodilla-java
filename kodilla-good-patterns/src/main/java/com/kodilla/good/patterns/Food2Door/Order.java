package com.kodilla.good.patterns.Food2Door;

public class Order {
    final private String deliverer;
    final private int quantity;
    final private String product;

    public Order(String deliverer, int quantity, String product) {
        this.deliverer = deliverer;
        this.quantity = quantity;
        this.product = product;
    }

    public String getDeliverer() {
        return deliverer;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return product;
    }
}