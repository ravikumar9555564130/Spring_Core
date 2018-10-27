package com.example.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.SingAndProLookUpMethod;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class SingAndProLookUpMethodTest {

	public static void main(String[] args) {
		
		SingAndProLookUpMethod singAndProLookUpMethod = null;

		ConfigurableApplicationContext context = SpringApplication.run(SingAndProLookUpMethodTest.class, args);

		singAndProLookUpMethod = context.getBean(SingAndProLookUpMethod.class);

		System.out.println("IciciBank :: " + singAndProLookUpMethod.getIciciBank());
		System.out.println("SbiBank :: " + singAndProLookUpMethod.getSbiBank());

		singAndProLookUpMethod = context.getBean(SingAndProLookUpMethod.class);

		System.out.println("IciciBank 1:: " + singAndProLookUpMethod.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProLookUpMethod.getSbiBank());

		singAndProLookUpMethod = context.getBean(SingAndProLookUpMethod.class);

		System.out.println("IciciBank 2:: " + singAndProLookUpMethod.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProLookUpMethod.getSbiBank());

	}
}
