package com.di.demo;

import com.di.demo.company.Company;
import com.di.demo.company.EmpConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringDiApplication.class, args);
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
	  Company company = context.getBean(Company.class);
	  company.getAllEmployeeInfo();
	  context.close();
	}

}
