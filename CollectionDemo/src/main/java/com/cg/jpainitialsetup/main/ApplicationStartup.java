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
		
		Address correspondanceAddress = new Address();
		correspondanceAddress.setHouseNo("168B");
		correspondanceAddress.setCity("Indore");
		correspondanceAddress.setState("MP");
		correspondanceAddress.setZip("452020");
		
		Address permanentAddress = new Address();
		permanentAddress.setHouseNo("F65");
		permanentAddress.setCity("Bhopal");
		permanentAddress.setState("MP");
		permanentAddress.setZip("452016");
		
		userDetail.getAddresses().add(correspondanceAddress);
		userDetail.getAddresses().add(permanentAddress);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
				
	}

}
