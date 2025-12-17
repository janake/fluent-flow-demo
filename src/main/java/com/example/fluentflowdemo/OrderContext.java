package com.example.fluentflowdemo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * Per-request context object held by the Flow.
 * Not a Spring bean -> created fresh for each incoming request.
 */
@RequiredArgsConstructor
@Accessors(fluent = true)
@Getter
public final class OrderContext {

    private final PlaceOrderCommand cmd;

    @Setter
    private BigDecimal totalAmount;
    @Setter
    private String reservationId;
    @Setter
    private String paymentId;
}
