package com.neo;

import com.neo.listener.ApplicationContextInitializedEventListener;
import com.neo.listener.ApplicationEnvironmentPreparedEventListener;
import com.neo.listener.ApplicationFailedEventListener;
import com.neo.listener.ApplicationPreparedEventListener;
import com.neo.listener.ApplicationReadyEventListener;
import com.neo.listener.ApplicationStartedEventListener;
import com.neo.listener.ApplicationStartingEventListener;
import com.neo.listener.ContextRefreshedEventListener;
import com.neo.listener.customer.MyEvent;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class HelloApplication {

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        log.info("application will be exit with code 42");
        return () -> 42;
    }

    public static void main(String[] args) {
//		SpringApplication.run(HelloApplication.class, args);

        /*----------- Customizing SpringApplication -----------*/
        SpringApplication springApplication = new SpringApplication(HelloApplication.class);

        springApplication.addListeners(new ApplicationStartingEventListener());
        springApplication.addListeners(new ApplicationEnvironmentPreparedEventListener());
        springApplication.addListeners(new ApplicationContextInitializedEventListener());
        springApplication.addListeners(new ApplicationPreparedEventListener());
        springApplication.addListeners(new ApplicationStartedEventListener());
        springApplication.addListeners(new ApplicationReadyEventListener());
        springApplication.addListeners(new ApplicationFailedEventListener());
        springApplication.addListeners(new ContextRefreshedEventListener());

        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);

        // execute event listener thread is sample with publish thread
        IntStream.rangeClosed(1, 2).forEach(i -> configurableApplicationContext.publishEvent(MyEvent.of("No." + i)));

        System.exit(SpringApplication.exit(configurableApplicationContext));
    }


}
