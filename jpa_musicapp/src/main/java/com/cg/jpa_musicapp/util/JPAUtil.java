package com.cg.jpa_musicapp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * This class will perform all the common operations related to JPA.
 * like providing EntityManagerFactory, EntityManager, beginTransaction, commit and release resources
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
