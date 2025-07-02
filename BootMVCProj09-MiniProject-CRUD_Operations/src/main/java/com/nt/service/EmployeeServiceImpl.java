package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	@Override
	public String saveEmployee(Employee employee) {
		
		int idval=repository.save(employee).getId();
		
		return "record saved with id :: "+idval;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Employee employee=repository.getReferenceById(id);
		
		return employee;
	}

	@Override
	public String updateEmployee(Employee employee) {
		
		Optional<Employee> opt=repository.findById(employee.getId());
		
		if(opt.isPresent()) {
			
			repository.save(employee);
			
			return "employee updated with id"+employee.getId();
		}
		
		return "employee not found with id"+employee.getId();
	}

	@Override
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		
		return "record deleted with id::"+id;
	}

}
