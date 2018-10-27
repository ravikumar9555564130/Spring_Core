package com.example.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.singlton.SingAndProApplicationContext;
import com.example.demo.singlton.SingAndProLookUpMethod;
import com.example.demo.singlton.SingAndProObjectFactory;
import com.example.demo.singlton.SingAndProProvider;
import com.example.demo.singlton.SingAndProScopeProxy;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class SingToProTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SingToProTest.class, args);

		// First approach-- by injecting ApplicationContext

		SingAndProApplicationContext singAndProApplicationContext = context.getBean(SingAndProApplicationContext.class);

		System.out.println("IciciBank :: " + singAndProApplicationContext.getIciciBank());
		System.out.println("SbiBank :: " + singAndProApplicationContext.getSbiBank());

		singAndProApplicationContext = context.getBean(SingAndProApplicationContext.class);

		System.out.println("IciciBank 1:: " + singAndProApplicationContext.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProApplicationContext.getSbiBank());

		singAndProApplicationContext = context.getBean(SingAndProApplicationContext.class);

		System.out.println("IciciBank 2:: " + singAndProApplicationContext.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProApplicationContext.getSbiBank());

		// Second approach-- by @lookUp Method injection

		SingAndProLookUpMethod singAndProLookUpMethod = context.getBean(SingAndProLookUpMethod.class);

		System.out.println("IciciBank :: " + singAndProLookUpMethod.getIciciBank());
		System.out.println("SbiBank :: " + singAndProLookUpMethod.getSbiBank());

		singAndProLookUpMethod = context.getBean(SingAndProLookUpMethod.class);

		System.out.println("IciciBank 1:: " + singAndProLookUpMethod.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProLookUpMethod.getSbiBank());

		singAndProLookUpMethod = context.getBean(SingAndProLookUpMethod.class);

		System.out.println("IciciBank 2:: " + singAndProLookUpMethod.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProLookUpMethod.getSbiBank());

		// Third approach :- by using Provider Interface

		SingAndProProvider singAndProProvider = context.getBean(SingAndProProvider.class);

		System.out.println("IciciBank :: " + singAndProProvider.getIciciBank());
		System.out.println("SbiBank :: " + singAndProProvider.getSbiBank());

		singAndProProvider = context.getBean(SingAndProProvider.class);

		System.out.println("IciciBank 1:: " + singAndProProvider.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProProvider.getSbiBank());

		singAndProProvider = context.getBean(SingAndProProvider.class);

		System.out.println("IciciBank 2:: " + singAndProProvider.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProProvider.getSbiBank());

		// Fourth approach-- Using Scoped Proxy

		SingAndProScopeProxy singAndProScopeProxy = context.getBean(SingAndProScopeProxy.class);

		System.out.println("IciciBank :: " + singAndProScopeProxy.getIciciBank());
		System.out.println("SbiBank :: " + singAndProScopeProxy.getSbiBank());

		singAndProScopeProxy = context.getBean(SingAndProScopeProxy.class);

		System.out.println("IciciBank 1:: " + singAndProScopeProxy.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProScopeProxy.getSbiBank());

		singAndProScopeProxy = context.getBean(SingAndProScopeProxy.class);

		System.out.println("IciciBank 2:: " + singAndProScopeProxy.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProScopeProxy.getSbiBank());

		// Fifth approach-- Spring provides the ObjectFactory<T> interface to produce on
		// demand objects of the given type:

		SingAndProObjectFactory singAndProObjectFactory = context.getBean(SingAndProObjectFactory.class);

		System.out.println("IciciBank :: " + singAndProObjectFactory.getIciciBank());
		System.out.println("SbiBank :: " + singAndProObjectFactory.getSbiBank());

		singAndProObjectFactory = context.getBean(SingAndProObjectFactory.class);

		System.out.println("IciciBank 1:: " + singAndProObjectFactory.getIciciBank());
		System.out.println("SbiBank 1:: " + singAndProObjectFactory.getSbiBank());

		singAndProObjectFactory = context.getBean(SingAndProObjectFactory.class);

		System.out.println("IciciBank 2:: " + singAndProObjectFactory.getIciciBank());
		System.out.println("SbiBank 2:: " + singAndProObjectFactory.getSbiBank());

	}
}
