package com.abhinav.employee_producer.service;
import java.util.List;

import com.abhinav.employee_producer.model.Employee;

public interface ServiceInterface {
	
	public List<Employee> getallrepo();
	public Employee  addrepo(Employee employeemodel);
	public String delete(String id);

}
