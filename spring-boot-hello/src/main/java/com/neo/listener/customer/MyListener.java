package com.neo.listener.customer;

import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyListener {

    @EventListener
    public void handleEvent(MyEvent event) throws InterruptedException {
        log.info("========== {} start handleEvent : {} ==========", Thread.currentThread().getName(), event);

        TimeUnit.SECONDS.sleep(5);

        log.info("========== {} end handleEvent : {} ==========" , Thread.currentThread().getName(), event);
    }

}

