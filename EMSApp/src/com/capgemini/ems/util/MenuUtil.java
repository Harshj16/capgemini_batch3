package com.capgemini.ems.util;

import java.util.List;
import java.util.Scanner;

import com.capgemini.ems.model.Employee;
import com.capgemini.ems.service.EmployeeService;
import com.capgemini.ems.serviceimpl.EmployeeServiceImpl;

public class MenuUtil {
	
	private EmployeeService employeeService;
	
	public MenuUtil() {
		employeeService=new EmployeeServiceImpl();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		int choice;
		String continueChoice;
		do {
			showMenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Employee employee = new Employee();
				System.out.println("Enter Name : ");
				employee.setName(sc.next());
				System.out.println("Enter Contact : ");
				employee.setContact(sc.next());
				System.out.println("Enter email : ");
				employee.setEmail(sc.next());
				employee.setId(System.currentTimeMillis());
				employeeService.createEmployee(employee);
				break;
			case 2:
				List<Employee> employees = employeeService.showAll();
				for (Employee emp : employees) {
					System.out.println(emp);
				}
				break;
			case 3:
				System.out.println("--------Update Employee---------");
				break;
			case 4:
				System.out.println("--------Remove Employee---------");
				
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Input");
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice=sc.next();
		}while(continueChoice.equals("yes"));

	}

	private void showMenu() {
		System.out.println("------Main Menu--------");
		System.out.println("1. Create Employee");
		System.out.println("2. List Employees");
		System.out.println("3. Update Employee");
		System.out.println("4. Remove Employee");
		System.out.println("0. Exit");
	}

}
