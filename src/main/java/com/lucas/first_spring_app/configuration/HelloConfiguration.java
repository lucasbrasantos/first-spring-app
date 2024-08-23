package com.lucas.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    public HelloConfiguration() {
        System.out.println("HelloConfiguration bean created");
    }

    /*@Bean
    public SDKAWS sdkaws(){ // For external library
        return new SDKAWS();
    }

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }*/
}
