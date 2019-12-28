package com.neo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationContextInitializedEvent is sent when the ApplicationContext is prepared
 *      and ApplicationContextInitializers have been called but before any bean definitions are loaded.
 */
@Slf4j
public class ApplicationContextInitializedEventListener implements ApplicationListener<ApplicationContextInitializedEvent> {

    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {
        log.info("onApplicationEvent(event={})", event);
    }
}
