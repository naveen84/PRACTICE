package com.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.dao.EmployeeDao;
import com.naveen.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee saveEmp(Employee emp) {
		
		return dao.save(emp);
	}

	@Override
	public List<Employee> getAll() {
		
		return dao.getAllEmployees();
	}

}
