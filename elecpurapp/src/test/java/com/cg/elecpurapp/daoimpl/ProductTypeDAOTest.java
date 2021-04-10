package com.cg.elecpurapp.daoimpl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.elecpurapp.dao.ProductTypeDAO;
import com.cg.elecpurapp.model.ProductType;

public class ProductTypeDAOTest {

	@Test
	public void test_save_GivenProductType_ShouldReturnProductType_Pass() {
		ProductTypeDAO productDAO =  new ProductTypeDAOImpl();
		ProductType pt = new ProductType();
		pt.setName("durable");
		ProductType proType = productDAO.save(pt);
		assertEquals("durable", proType.getName());
	}
	
	


}
