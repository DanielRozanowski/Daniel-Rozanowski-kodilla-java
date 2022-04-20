package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepo orderRepo;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepo orderRepo) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepo = orderRepo;
    }
    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.sendMessage(orderRequest.getUser());
            orderRepo.createOrder(orderRequest);
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }
}
