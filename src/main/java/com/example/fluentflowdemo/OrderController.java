package com.example.fluentflowdemo;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderFacade orderFacade;

    @PostMapping
    public ResponseEntity<OrderResult> placeOrder(@RequestBody @Valid PlaceOrderCommand cmd) {
        return ResponseEntity.ok(orderFacade.placeOrder(cmd));
    }
}
