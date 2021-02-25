package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloWorldSpringHttpJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringHttpJavaApplication.class, args);
    }

    @Bean
    public Function<String, String> function() {
        return value -> "Hello " + value;
    }

}
