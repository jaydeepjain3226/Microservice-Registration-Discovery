package com.abhinav.employee_producer.model.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhinav.employee_producer.model.Employee;
@RestController

public class TestController {
	
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public Employee firstpage() {
		 Employee emp = new Employee();
		 emp.setName("abhinav");
		 emp.setEmpId("1");
		 emp.setDesignation("manager");
		 emp.setSalary(2000000);
		 
		 return emp;
	}
	

}
