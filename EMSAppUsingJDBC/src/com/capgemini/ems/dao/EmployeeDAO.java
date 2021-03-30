package com.capgemini.ems.dao;

import java.util.List;

import com.capgemini.ems.model.Employee;

/**
 * This EmployeeDAO will be responsible for performing all the CRUD operations
 * on Employee
 * 
 * @author panka
 *
 */
public interface EmployeeDAO {

	/**
	 * This save method will save the provided employee in repository
	 * 
	 * @param employee to be saved
	 */
	void save(Employee employee);

	/**
	 * This update method will update the employee detail
	 * 
	 * @param employee to be updated
	 */
	void update(Employee employee);

	/**
	 * This delete method will delete the employee from the repository
	 * 
	 * @param employee to be deleted
	 */
	void delete(Employee employee);

	/**
	 * This findAll method will return list of employees
	 * 
	 * @return list of employees if found otherwise null
	 */
	List<Employee> findAll();

}
