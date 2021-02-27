package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloFunctionTest {

    @Test
    public void test() {
        Greeting result = new HelloFunction().hello().apply(new User("Robert"));
        assertThat(result.getMessage()).isEqualTo("Hello Robert!");
    }

    @Test
    public void start() {
        AzureSpringBootRequestHandler<User, Greeting> handler = new AzureSpringBootRequestHandler<>(
                HelloFunction.class);
        Greeting result = handler.handleRequest(new User("Robert"), null);
        handler.close();
        assertThat(result.getMessage()).isEqualTo("Hello Robert!");
    }
}