package com.mohit.activemq.activemq_producer;

import com.mohit.activemq.activemq_base.model.Employee;
import com.mohit.activemq.activemq_producer.manager.ProducerManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

import java.util.List;

@EnableJms
@SpringBootApplication(scanBasePackages = {"com.mohit.activemq.activemq_base","com.mohit.activemq.activemq_producer"})
public class ActivemqProducerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ActivemqProducerApplication.class, args);

        ProducerManager producerManager = context.getBean(ProducerManager.class);
        List<Employee> employeeList = producerManager.getRandomNEmployees(10);
        for(Employee emp : employeeList){
            producerManager.sendMessage(emp);
        }
    }

}
