package com.example.fluentflowdemo;

import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicLong;

@Repository
public class OrderRepository {

    private final AtomicLong seq = new AtomicLong(1000);

    public Long save(OrderContext ctx) {
        // Real life: map ctx -> Order entity and persist
        return seq.incrementAndGet();
    }
}
