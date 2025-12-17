package com.example.fluentflowdemo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record PlaceOrderCommand(
        @NotNull Long userId,
        @NotNull Long productId,
        @Min(1) int quantity
) {}
