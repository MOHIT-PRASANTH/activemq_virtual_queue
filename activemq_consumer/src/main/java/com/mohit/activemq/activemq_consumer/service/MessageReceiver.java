package com.mohit.activemq.activemq_consumer.service;

import com.mohit.activemq.activemq_base.model.Employee;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "${myActivemq.destination}", containerFactory = "listenerContainerFactory")
    public void receiveMessage(Employee employee){
        System.out.println("Received : "+employee);
    }

    @JmsListener(destination = "${myActivemq.destination}", containerFactory = "listenerContainerFactory")
    public void receiveMessage2(Employee employee){
        System.out.println("Received2 :"+employee);
    }

    @JmsListener(destination = "${myActivemq.destination2}", containerFactory = "listenerContainerFactory")
    public void receiveMessage3(Employee employee){
        System.out.println("Received3 :"+employee);
    }

}