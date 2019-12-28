package com.neo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationEnvironmentPreparedEvent is send when the Environment
 *      to be used in the context is known but before the context is created
 */
@Slf4j
public class ApplicationEnvironmentPreparedEventListener implements
        ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        log.info("onApplicationEvent(event={})", event);
    }
}
