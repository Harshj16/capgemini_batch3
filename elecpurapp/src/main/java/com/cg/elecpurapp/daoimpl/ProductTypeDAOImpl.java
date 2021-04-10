package com.cg.elecpurapp.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.elecpurapp.dao.ProductTypeDAO;
import com.cg.elecpurapp.model.ProductType;
import com.cg.elecpurapp.util.JPAUtil;

public class ProductTypeDAOImpl extends JPAUtil implements ProductTypeDAO {

	@Override
	public ProductType save(ProductType pt) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(pt);
		em.getTransaction().commit();
		em.close();
		
		ProductType retProductType = getSavedProductType(pt);
		return retProductType;
	}

	private ProductType getSavedProductType(ProductType pt) {
		// Logic for getting the saved productType from db
		EntityManager newem = getEntityManager();
		newem.getTransaction().begin();
		TypedQuery<ProductType> query =newem.createQuery("select p from ProductType p where p.name=:name", ProductType.class);
		ProductType retProductType = query.setParameter("name", pt.getName()).getSingleResult();
		
		newem.getTransaction().commit();
		newem.close();
		return retProductType;
	}

}
