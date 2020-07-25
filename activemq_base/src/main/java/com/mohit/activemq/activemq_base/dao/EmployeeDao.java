package com.mohit.activemq.activemq_base.dao;

import com.mohit.activemq.activemq_base.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    public List<Employee> getRandomNEmployees(int N){
      List<Employee> employeeList = new ArrayList<>();
      for(int i=0; i<N; i++){
          Employee emp = new Employee();
          emp.setAge(i);
          emp.setName("Emp"+i);
          emp.setSalary(1.0 * (i*500)%3);
          employeeList.add(emp);
      }
      return employeeList;
    }
}
