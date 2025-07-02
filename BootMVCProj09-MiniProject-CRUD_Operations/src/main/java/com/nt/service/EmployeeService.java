package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public String saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(int id);
}

