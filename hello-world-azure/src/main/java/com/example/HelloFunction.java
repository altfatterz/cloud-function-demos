package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloFunction {

    public static void main(String[] args) {
        SpringApplication.run(HelloFunction.class, args);
    }

    @Bean
    public Function<User, Greeting> hello() {
        return user -> new Greeting("Hello " + user.getName() + "!");
    }
}
