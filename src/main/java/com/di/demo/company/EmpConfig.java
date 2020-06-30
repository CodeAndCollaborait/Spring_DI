package com.di.demo.company;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.di.demo")
public class EmpConfig {

  @Bean
  public Employee getEmployee(){
    return new EmployeeService();
  }



}
