package com.neo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 项目名称：
 * 类名称：ConcreateApplicationRunner
 * 类描述：
 * @author liubo
 * 创建时间：2019/12/25 15:22
 */
@Component
public class ConcreateApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("The ConcreateApplicationRunner start to initialize ..., args = " + args);
    }
}
