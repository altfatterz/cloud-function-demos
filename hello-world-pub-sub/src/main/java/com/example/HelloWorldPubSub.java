package com.example;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class HelloWorldPubSub implements BackgroundFunction<MyMessage> {

    @Override
    public void accept(MyMessage message, Context context) {
        String name = "world";
        if (message != null && message.getData() != null) {
            name = new String(
                    Base64.getDecoder().decode(message.getData().getBytes(StandardCharsets.UTF_8)),
                    StandardCharsets.UTF_8);
        }
        System.out.println(String.format("Hello %s!", name));
    }
}
