package com.createid.Service;

import com.createid.dao.EmployeeDao;
import com.createid.dao.EmpoyeeDaoImple;
import com.createid.main.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao= employeeDao;
	}

	public void save(Employee employee) {
		System.out.println("Employee Service -> save method called");
		employeeDao.save(employee);
	}
}
