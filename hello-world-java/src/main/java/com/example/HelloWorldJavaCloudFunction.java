package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.PrintWriter;

public class HelloWorldJavaCloudFunction implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        String name = request.getFirstQueryParameter("name").orElse("world");
        var writer = new PrintWriter(response.getWriter());
        writer.printf("Hello %s!", name);
    }
}
