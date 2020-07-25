package com.mohit.activemq.activemq_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mohit.activemq.activemq_base","com.mohit.activemq.activemq_consumer"})
public class ActivemqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqConsumerApplication.class, args);
    }

}
