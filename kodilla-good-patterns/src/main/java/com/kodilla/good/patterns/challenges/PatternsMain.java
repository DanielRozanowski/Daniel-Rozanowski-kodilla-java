package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.*;

class Application {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.request();
        OrderProcessor orderProcessor = new OrderProcessor(new ConfirmService(),
                new ProductOrderService(), new ProductOrderRepo());
        orderProcessor.process(orderRequest);
            MovieStore movieStore = new MovieStore();

            movieStore.getMovies().values().stream()
                    .flatMap(strings -> strings.stream())
                    .forEach(s -> System.out.print(s+"! "));
        }
    }