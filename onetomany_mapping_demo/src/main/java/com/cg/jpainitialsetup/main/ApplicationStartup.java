package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.Employee;
import com.cg.jpainitialsetup.domain.Project;

public class ApplicationStartup {

	public static void main(String[] args) {
		// Assume this is the Data layer and you are already getting userDetail object from service. 
		
		Employee employee = new Employee();
		employee.setName("Pankaj Sharma");
		
		
		Project internalProject=new Project();
		internalProject.setTitle("Java React FullStack Training");
		
		
		Project externalProject=new Project();
		externalProject.setTitle("Music App");
		
		employee.getProjects().add(internalProject);
		employee.getProjects().add(externalProject);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
				
	}

}
