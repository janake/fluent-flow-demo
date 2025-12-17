package com.example.fluentflowdemo;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void charge(OrderContext ctx) {
        // In real life: record payment intent, call external PSP, handle idempotency, etc.
        ctx.paymentId("PAY-" + System.currentTimeMillis());
    }
}
