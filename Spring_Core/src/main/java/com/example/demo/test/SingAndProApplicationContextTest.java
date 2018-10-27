package com.example.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.SingAndProApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class SingAndProApplicationContextTest {

	public static void main(String[] args) {
		SingAndProApplicationContext singAndProApplicationContext = null;

		ConfigurableApplicationContext context = SpringApplication.run(SingAndProApplicationContextTest.class, args);

		singAndProApplicationContext = context.getBean(SingAndProApplicationContext.class);

		System.out.println("IciciBank :: " + singAndProApplicationContext.getIciciBank());
		System.out.println("SbiBank :: " + singAndProApplicationContext.getSbiBank());

		singAndProApplicationContext = context.getBean(SingAndProApplicationContext.class);

		System.out.println("IciciBank 1:: " + singAndProApplicationContext.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProApplicationContext.getSbiBank());

		singAndProApplicationContext = context.getBean(SingAndProApplicationContext.class);

		System.out.println("IciciBank 2:: " + singAndProApplicationContext.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProApplicationContext.getSbiBank());

	}
}
