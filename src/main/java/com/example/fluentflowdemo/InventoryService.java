package com.example.fluentflowdemo;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class InventoryService {

    public void reserve(OrderContext ctx) {
        // stock check + reservation would be here
        ctx.reservationId("RES-" + System.currentTimeMillis());

        // demo pricing: 1999 per unit
        ctx.totalAmount(BigDecimal.valueOf(ctx.cmd().quantity()).multiply(BigDecimal.valueOf(1999)));
    }
}
