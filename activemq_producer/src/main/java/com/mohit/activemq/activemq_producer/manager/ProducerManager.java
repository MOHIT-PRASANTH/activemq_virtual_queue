package com.mohit.activemq.activemq_producer.manager;

import com.mohit.activemq.activemq_base.dao.EmployeeDao;
import com.mohit.activemq.activemq_base.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProducerManager {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${myActivemq.destination}")
    private String destination;

    public List<Employee> getRandomNEmployees(int N){
        return employeeDao.getRandomNEmployees(N);
    }

    public void sendMessage(Employee employee){
        System.out.println("Sending : "+employee);
        jmsTemplate.convertAndSend(destination,employee);
    }
}
