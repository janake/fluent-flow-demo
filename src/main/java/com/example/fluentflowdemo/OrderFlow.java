package com.example.fluentflowdemo;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

/**
 * Fluent "use-case flow" that delegates each step to Spring services.
 * This object is created per request, so it is safe to keep mutable state (OrderContext).
 */
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class OrderFlow {

    private final OrderContext ctx;

    private final ValidationService validationService;
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;
    private final OrderRepository orderRepository;

    public OrderFlow validate() {
        validationService.validate(ctx);
        return this;
    }

    public OrderFlow reserveStock() {
        inventoryService.reserve(ctx);
        return this;
    }

    public OrderFlow charge() {
        paymentService.charge(ctx);
        return this;
    }

    public OrderFlow notifyCustomer() {
        notificationService.notifyCustomer(ctx);
        return this;
    }

    public OrderResult done() {
        var orderId = orderRepository.save(ctx);
        return new OrderResult(orderId, true,
                "OK (reservationId=%s, paymentId=%s, total=%s)"
                        .formatted(ctx.reservationId(), ctx.paymentId(), ctx.totalAmount()));
    }
}
