package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String showHome()
	{
		return "welcome";
	}
	
	@GetMapping("/report")
	public String showReportData(Map<String, Object> map)
	{
		
		List<Employee> list=service.getAllEmployees();
		
		map.put("empinfo", list);
		
		return "show_report";
	}
	
	@GetMapping("/register")
	public String registerEmployeeForm(@ModelAttribute("emp") Employee employee)
	{
		return "employee_registration_form";
	}
	
	@PostMapping("/register")
	public String processEmployee(@ModelAttribute("emp") Employee employee,RedirectAttributes attributes)
	{
		String idval=service.saveEmployee(employee);
		
		attributes.addFlashAttribute("result", idval);
		
		return "redirect:report";
	}
	
	@GetMapping("/edit")
	public String showEditForm(@RequestParam("id") int id,@ModelAttribute("emp") Employee emp) {
		
		Employee employee=service.getEmployeeById(id);
		
		BeanUtils.copyProperties(employee, emp);
		
		return "employee_edit_form";	
	}
	
	@PostMapping("/edit")
	public String processEmployeeEdit(@ModelAttribute("emp") Employee employee,RedirectAttributes attributes)
	{
		String msg=service.updateEmployee(employee);
		
		attributes.addFlashAttribute("result", msg);
		
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String processDeleteEmployee(@RequestParam("id") int id,RedirectAttributes attributes)
	{
		String msg=service.deleteEmployee(id);
		
		attributes.addFlashAttribute("result", msg);
		
		return "redirect:report";
	}
}
