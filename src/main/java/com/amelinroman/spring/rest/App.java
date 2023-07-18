package com.amelinroman.spring.rest;

import com.amelinroman.spring.rest.configuration.MyConfig;
import com.amelinroman.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )  {
       var context = new AnnotationConfigApplicationContext(MyConfig.class);
       var communication = context.getBean("communication", Communication.class);
        System.out.println(communication.getAllEmployees());
        System.out.println(communication.getEmployee(8));
        var employee = new Employee("Sveta", "Petrova", "HR", 780);
        communication.saveOrUpdateEmployee(employee);
        employee.setId(13);
        employee.setSalary(900);
        communication.saveOrUpdateEmployee(employee);
        communication.deleteEmployee(13);
    }
}
