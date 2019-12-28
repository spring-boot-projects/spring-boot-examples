package com.neo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * 项目名称：
 * 类名称：ApplicationStartingEventListener
 * 类描述：
 * @author liubo
 * 创建时间：2019/12/26 16:43
 */
@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("onApplicationEvent(event={})", event);
    }
}
