package com.abhinav.employee_producer.model.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhinav.employee_producer.model.Employee;
//import com.abhinav.employee_producer.repo.DbmsRepo;



@RestController
public class TestController {
	

	
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public Employee firstpage() {
		 Employee emp = new Employee();
		 emp.setName("abhinav");
		 emp.setEmpId(1);
		 emp.setDesignation("manager");
		 emp.setSalary(2000000);
		 
		 return emp;
	}
	

}
