package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private Item item;
    private LocalDate orderDate;

    public OrderRequest(User user, Item item, LocalDate orderDate) {
        this.user = user;
        this.item = item;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
