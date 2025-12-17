package com.example.fluentflowdemo;

public record OrderResult(Long orderId, boolean success, String message) {}
