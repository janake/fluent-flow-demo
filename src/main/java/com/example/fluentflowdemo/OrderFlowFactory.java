package com.example.fluentflowdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OrderFlowFactory {

    private final ValidationService validationService;
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;
    private final OrderRepository orderRepository;

    public OrderFlow start(PlaceOrderCommand cmd) {
        var ctx = new OrderContext(cmd);
        return new OrderFlow(
                ctx,
                validationService,
                inventoryService,
                paymentService,
                notificationService,
                orderRepository
        );
    }
}
