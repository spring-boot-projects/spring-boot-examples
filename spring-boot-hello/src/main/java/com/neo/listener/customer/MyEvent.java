package com.neo.listener.customer;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }

    public static MyEvent of (Object source) {
        return new MyEvent(source);
    }
}
