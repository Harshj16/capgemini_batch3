package com.capgemini.ems.daoimpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.capgemini.ems.dao.EmployeeDAO;
import com.capgemini.ems.model.Employee;
import com.capgemini.ems.util.FileUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	private FileUtil fileUtil;

	public EmployeeDAOImpl() {
		fileUtil = new FileUtil();
	}

	@Override
	public void save(Employee employee) {
		// open file
		fileUtil.openOutputFile();
		// write data
		fileUtil.writeObjectInFile(employee);
		// close file
		fileUtil.closeOutputFile();

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
		//Open file
		fileUtil.openInputFile();
		//ReadAll records
		List<StringTokenizer> records =  fileUtil.readAllRecords();
		//Prepare list of employees
		
		List<Employee> employees=new ArrayList<>();
		Employee employee;
    	for (StringTokenizer stringTokenizer : records) {
    		employee=new Employee();
    		employee.setId(Long.parseLong(stringTokenizer.nextToken()));
    		employee.setName(stringTokenizer.nextToken());
    		employee.setContact(stringTokenizer.nextToken());
    		employee.setEmail(stringTokenizer.nextToken());
    		employees.add(employee);
		}
		//return employee list
		return employees;
	}

}
