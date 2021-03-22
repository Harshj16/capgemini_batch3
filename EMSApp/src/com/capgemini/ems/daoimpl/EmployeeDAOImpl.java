package com.capgemini.ems.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.ems.dao.EmployeeDAO;
import com.capgemini.ems.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private List<Employee> employeeRepository;
	
	public EmployeeDAOImpl() {
		employeeRepository=new ArrayList<>();
		
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.add(employee);
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {		
		return employeeRepository;
	}

}
