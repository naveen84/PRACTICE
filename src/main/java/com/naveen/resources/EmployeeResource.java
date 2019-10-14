package com.naveen.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.exceptions.EmployeeEmptyException;
import com.naveen.model.Employee;
import com.naveen.service.EmployeeService;

@RestController
public class EmployeeResource {
	@Autowired
	public EmployeeService service;
	
	@RequestMapping(value="/emp",consumes="application/json",produces="application/json",method=RequestMethod.POST)
	public Employee save(@RequestBody Employee employee) throws EmployeeEmptyException{
		
		if(employee == null)
			throw new EmployeeEmptyException("EMPTY EMPLOYEE");
		return service.saveEmp(employee);
		
	}
	@RequestMapping(method=RequestMethod.GET,produces="application/json")
	public List<Employee> getAll() throws EmployeeEmptyException{
		List<Employee> employees = service.getAll();
		if(employees == null)
			throw new EmployeeEmptyException("EMPTY EMPLOYEE");
		return employees;
	}
	
	@RequestMapping(value="/erroremp",method=RequestMethod.POST)
	public String error() throws EmployeeEmptyException{
		
		return "authentication failed";
	}
}
