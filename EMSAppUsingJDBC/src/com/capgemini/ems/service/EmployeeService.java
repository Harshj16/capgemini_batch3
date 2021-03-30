package com.capgemini.ems.service;

import java.util.List;

import com.capgemini.ems.model.Employee;

/**
 * This EmployeeService is responsible for performing all the business logic on
 * Employee Operations.
 * 
 * @author panka
 *
 */
public interface EmployeeService {
	/**
	 * This createEmployee method will create the employee in the system
	 * 
	 * @param employee to be created
	 */
	void createEmployee(Employee employee);

	/**
	 * This updateEmployee method will update the employee
	 * 
	 * @param employee to be updated
	 */
	void updateEmployee(Employee employee);

	/**
	 * This removeEmployee method will remove the provided employee from the system
	 * 
	 * @param employee
	 */
	void removeEmployee(Employee employee);

	/**
	 * This showAll method will return the list of available employees in the system
	 * if found.
	 * 
	 * @return list of Employees if found otherwise null
	 */
	List<Employee> showAll();

}
