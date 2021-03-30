package com.capgemini.ems.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.ems.dao.EmployeeDAO;
import com.capgemini.ems.model.Employee;
import com.capgemini.ems.util.DBUtil;

public class EmployeeDAOImpl extends DBUtil implements EmployeeDAO{
	
	private static Logger logger =  Logger.getLogger(EmployeeDAOImpl.class);
	
	public EmployeeDAOImpl() {
		
		
	}

	@Override
	public void save(Employee employee) {
		String sql = "insert into employees (name,contact,email) values (?,?,?)";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setString(1, employee.getName());
			pstmt.setString(2, employee.getContact());
			pstmt.setString(3, employee.getEmail());
			pstmt.execute();
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
		finally {
			closePrepareStatement();
			closeConnection();
		}
		
		
		
	}

	@Override
	public void update(Employee employee) {
		String sql ="update employees set name=?, contact=?, email=? where id=?";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setString(1, employee.getName());
			pstmt.setString(2, employee.getContact());
			pstmt.setString(3, employee.getEmail());
			pstmt.setLong(4, employee.getId());
			pstmt.execute();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {	
		String sql ="select * from employees";
		PreparedStatement pstmt = prepareStatement(sql);
		List<Employee> employees= new ArrayList<>();
		try {
			ResultSet rs =   pstmt.executeQuery();
			Employee emp=null;
			while(rs.next()) {
				emp=new Employee();
				emp.setId(rs.getLong("id"));
				emp.setName(rs.getString("name"));
				emp.setContact(rs.getString("contact"));
				emp.setEmail(rs.getString("email"));
				employees.add(emp);
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
		finally {
			closePrepareStatement();
			closeConnection();
		}
		return employees;
	}

}
