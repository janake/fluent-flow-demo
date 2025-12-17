package com.example.fluentflowdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    public void notifyCustomer(OrderContext ctx) {
        log.info("Notifying userId={} about order: reservationId={}, paymentId={}, total={}",
                ctx.cmd().userId(), ctx.reservationId(), ctx.paymentId(), ctx.totalAmount());
    }
}
