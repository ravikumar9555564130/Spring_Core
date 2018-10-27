package com.example.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.TestApp;

@SpringBootApplication
@ComponentScan(basePackages="com.example.demo")
public class MyTestApplication {

	public static void main(String[] args) {
		TestApp testApp = null;

		ConfigurableApplicationContext context = SpringApplication.run(MyTestApplication.class, args);

		testApp = context.getBean(TestApp.class);

		System.out.println("IciciBank :: " + testApp.getIciciBank());
		System.out.println("SbiBank :: " + testApp.getSbiBank());

		testApp = context.getBean(TestApp.class);

		System.out.println("IciciBank 1:: " + testApp.getIciciBank());
		System.out.println("SbiBank 1:: " + testApp.getSbiBank());

		testApp = context.getBean(TestApp.class);

		System.out.println("IciciBank 2:: " + testApp.getIciciBank());
		System.out.println("SbiBank 2:: " + testApp.getSbiBank());

	}
}
