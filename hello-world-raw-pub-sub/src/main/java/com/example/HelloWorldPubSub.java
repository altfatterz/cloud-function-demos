package com.example;

import com.google.cloud.functions.Context;
import com.google.cloud.functions.RawBackgroundFunction;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class HelloWorldPubSub implements RawBackgroundFunction {

    @Override
    public void accept(String json, Context context) throws Exception {
        System.out.println("Payload:" + json);
    }
}
