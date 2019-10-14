package com.naveen.service;

import java.util.List;

import com.naveen.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmp(Employee emp);
	public List<Employee> getAll();
}
