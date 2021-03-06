package com.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Employee;
import com.employee.dao.EmployDio;
import com.employee.service.EmployService;

@Service
public class EmployServiceImpl implements EmployService {

	@Autowired
	EmployDio employDio;

	@Override
	public Employee getEmoloyee(int id) {
		return employDio.getEmployee(id);
	}

}
