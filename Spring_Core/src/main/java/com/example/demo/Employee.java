package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private String name;

	public Employee() {
		System.out.println("Employee is created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("id :: " + id + ", name :: " + name);
	}

}
