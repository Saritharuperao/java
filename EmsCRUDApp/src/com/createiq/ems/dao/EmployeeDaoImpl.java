package com.createiq.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.createiq.ems.model.Employee;
import com.createiq.ems.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDAO{

	@Override
	public Employee save(Employee employee) {
	Connection connection = ConnectionUtil.getConnection();
	PreparedStatement ps = null;
	try {
		 ps = connection.prepareStatement("insert into employee values(?,?,?,?)");
		
		ps.setInt(1,employee.getId());
		ps.setString(2, employee.getName());
		ps.setDouble(3,employee.getSalary());
		ps.setString(4, employee.getEmail());
		
		int result = ps.executeUpdate();
		System.out.println("row" + result + "inserted...!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ConnectionUtil.closeConnection(connection, ps);
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
