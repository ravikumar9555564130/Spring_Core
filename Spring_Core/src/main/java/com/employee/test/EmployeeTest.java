package com.employee.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.employee.Employee;
import com.employee.service.EmployService;
import com.employee.service.impl.EmployServiceImpl;

@SpringBootApplication
@ComponentScan(basePackages = { "com.employee.service.impl", "com.employee.dao.impl" })
public class EmployeeTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(EmployeeTest.class, args);

		EmployService employService = context.getBean(EmployServiceImpl.class);
		Employee emoloyee = employService.getEmoloyee(2);

		System.out.println("employee :: " + emoloyee);

	}
}
