package com.cg.elecpurapp.serviceimpl;

import com.cg.elecpurapp.dao.ProductTypeDAO;
import com.cg.elecpurapp.daoimpl.ProductTypeDAOImpl;
import com.cg.elecpurapp.model.ProductType;
import com.cg.elecpurapp.service.ProductTypeService;

public class ProductTypeServiceImpl implements ProductTypeService{
	
	private ProductTypeDAO productTypeDAO;
	
	public ProductTypeServiceImpl() {
		productTypeDAO=new ProductTypeDAOImpl();
	}

	@Override
	public ProductType addProductType(ProductType productType) {
		
		return productTypeDAO.save(productType);
	}

}
