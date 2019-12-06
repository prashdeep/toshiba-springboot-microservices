package com.toshiba.organizationservice;

import com.toshiba.organizationservice.model.Asset;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@EnableBinding(Sink.class)
public class OrganizationServiceApplication {

    @StreamListener(Sink.INPUT)
    public void loggerSink(
            Asset asset) {
        System.out.format("Received an event for   %s" , asset);
    }

    public static void main(String[] args) {
        SpringApplication.run(OrganizationServiceApplication.class, args);
    }

}
