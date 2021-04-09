package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.Address;
import com.cg.jpainitialsetup.domain.UserDetail;

public class ApplicationStartup {

	public static void main(String[] args) {
		// Assume this is the Data layer and you are already getting userDetail object from service. 
		
		UserDetail userDetail =  new UserDetail();
		userDetail.setName("Pankaj");
		userDetail.setContact("8827611875");
		
		Address address = new Address();
		address.setHouseNo("168B");
		address.setCity("Indore");
		address.setState("MP");
		address.setZip("452020");
		
		userDetail.setAddress(address);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
				
	}

}
