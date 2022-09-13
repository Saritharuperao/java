package com.createid.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createid.Controller.EmployeeController;
import com.createid.main.Employee;



public class Test {
	public static void main(String[] args) {
		//  EmployeeController employeeController= new EmployeeController();
		ApplicationContext applicationContext	= new ClassPathXmlApplicationContext("auto.xml");
		EmployeeController employeeController =(EmployeeController)applicationContext.getBean("employeeController");
		Employee	employee =  new Employee(23, "saritha", 45000.00);
		employeeController.save(employee);
		}

	} 

