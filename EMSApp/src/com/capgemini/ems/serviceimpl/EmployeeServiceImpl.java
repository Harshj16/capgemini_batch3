package com.capgemini.ems.serviceimpl;

import java.util.List;

import com.capgemini.ems.dao.EmployeeDAO;
import com.capgemini.ems.daoimpl.EmployeeDAOImpl;
import com.capgemini.ems.model.Employee;
import com.capgemini.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	//Dependency
	private EmployeeDAO employeeDAO;
	public EmployeeServiceImpl() {
		employeeDAO=new EmployeeDAOImpl();
	}
	

	@Override
	public void createEmployee(Employee employee) {
		// TODO Business logic here related to employee creation
		employeeDAO.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> showAll() {
		// TODO Business logic here related to employee creation
		return employeeDAO.findAll();
	}

}
