package com.createiq.ems.dao;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeDAO {
Employee save (Employee employee);
Employee update (Employee employee);
List<Employee> getAllEmps();
int delete(int id);
}
