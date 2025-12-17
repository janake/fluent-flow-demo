package com.example.fluentflowdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderFacade {

    private final OrderFlowFactory flowFactory;

    public OrderResult placeOrder(PlaceOrderCommand cmd) {
        return flowFactory.start(cmd)
                .validate()
                .reserveStock()
                .charge()
                .notifyCustomer()
                .done();
    }
}
