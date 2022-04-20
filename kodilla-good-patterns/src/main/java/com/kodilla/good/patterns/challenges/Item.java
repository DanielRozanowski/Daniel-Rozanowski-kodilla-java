package com.kodilla.good.patterns.challenges;

public class Item {
    private String itemName;
    private String itemSpecification;
    private double price;

    public Item(String itemName, String itemSpecification, double price) {
        this.itemName = itemName;
        this.itemSpecification = itemSpecification;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemSpecification() {
        return itemSpecification;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemSpecification='" + itemSpecification + '\'' +
                ", price=" + price +
                '}';
    }
}
