package com.naveen.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Repository;

import com.naveen.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> employees;
	
	public Employee save(Employee emp) {
		employees = new ArrayList<>();
		Predicate<Employee> p = employee->employee!=null;
		  if(p.test(emp))
			  employees.add(emp);
		 return emp;
	}

	public List<Employee> getAllEmployees() {
		if(employees!=null)
		  return employees;
		return null;
	}

}
