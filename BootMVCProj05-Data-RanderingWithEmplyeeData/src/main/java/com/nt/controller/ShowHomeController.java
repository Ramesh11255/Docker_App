package com.nt.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Employee;

@Controller
public class ShowHomeController {

	@GetMapping("/")
	public String showHome(Map<String, Object> map) {
				
		List<Employee> list=List.of(new Employee(101, "ramesh", "hyd", 75000),
				                    new Employee(102, "ramu", "chittor", 45000),
		                            new Employee(103, "kranthi", "ben", 50000));
		
		map.put("emps", list);
		
		return "home";
	}
}
