package com.createid.Controller;

import com.createid.Service.EmployeeService;
import com.createid.main.Employee;


public class EmployeeController {


	private EmployeeService employeeService; 
	
	
	

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
}
	public void save(Employee employee) {
		System.out.println("Employee Controller -> save method called ");
		employeeService.save(employee);
	}
}