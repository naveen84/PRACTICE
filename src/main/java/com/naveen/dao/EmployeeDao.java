package com.naveen.dao;

import java.util.List;

import com.naveen.model.Employee;

public interface EmployeeDao {
	
	public Employee save(Employee emp);
	public List<Employee> getAllEmployees();
}
