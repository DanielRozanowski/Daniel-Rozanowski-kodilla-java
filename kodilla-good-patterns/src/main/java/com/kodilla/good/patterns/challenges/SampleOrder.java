package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SampleOrder {
    public OrderRequest request() {
        User user = new User("John", "Doe", "johndoe@mail.com");
        Item item = new Item("How spent less than 100$?", "The best book for every smart businessman",
                98.99);

        LocalDate orderDate = LocalDate.now();
        return new OrderRequest(user, item, orderDate);
    }
}
