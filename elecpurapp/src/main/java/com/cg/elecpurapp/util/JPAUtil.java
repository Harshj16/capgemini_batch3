package com.cg.elecpurapp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * This JPAUtil class will be performing common tasks
 * like :  getting EntityManager instance, releasing entity Manager
 * @author pankaj
 *
 */

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}

//	private static EntityManagerFactory getEntityManagerFactory() {
//		return entityManagerFactory;
//	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public void beginTransaction() {
		getEntityManager().getTransaction().begin();
	}
	
	public void commitTransaction() {
		getEntityManager().getTransaction().commit();
	}
	
	public void closeEntityManager() {
		getEntityManager().close();
	}
	


}
