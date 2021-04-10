package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.Employee;
import com.cg.jpainitialsetup.domain.ExternalProject;
import com.cg.jpainitialsetup.domain.InternalProject;
import com.cg.jpainitialsetup.domain.Project;

public class ApplicationStartup {

	public static void main(String[] args) {
		// Assume this is the Data layer and you are already getting userDetail object from service. 
		
		Employee employee = new Employee();
		employee.setName("Pankaj Sharma");
		
		
		InternalProject internalProject=new InternalProject();
		internalProject.setTitle("Java React FullStack Training");
		internalProject.setManagerName("Rakesh");
		
		
		ExternalProject externalProject=new ExternalProject();
		externalProject.setTitle("Music App");
		externalProject.setClientName("Sony");
		
		employee.getProjects().add(internalProject);
		employee.getProjects().add(externalProject);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(internalProject);
		entityManager.persist(externalProject);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
				
	}

}
