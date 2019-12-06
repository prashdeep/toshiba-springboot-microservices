package com.toshiba.zuulservice;

import com.toshiba.zuulservice.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UserContextInterceptor implements ClientHttpRequestInterceptor {

    @Autowired
    private UserContext userContext;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        System.out.println("Inside the interceptor :: "+ userContext.getCorrelationId());
        request.getHeaders().add("correlation-id", userContext.getCorrelationId() );
        ClientHttpResponse clientHttpResponse = execution.execute(request, body);
        return clientHttpResponse;
    }
}