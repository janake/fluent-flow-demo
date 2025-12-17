package com.example.fluentflowdemo;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public void validate(OrderContext ctx) {
        if (ctx.cmd().quantity() <= 0) {
            throw new IllegalArgumentException("Quantity must be > 0");
        }
        // you can add more validations here (user exists, product exists, etc.)
    }
}
