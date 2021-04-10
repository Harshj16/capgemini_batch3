package com.cg.elecpurapp.util;

import java.util.Scanner;

import com.cg.elecpurapp.model.ProductType;
import com.cg.elecpurapp.service.ProductTypeService;
import com.cg.elecpurapp.serviceimpl.ProductTypeServiceImpl;

public class MenuUtil {
	
	private ProductTypeService productTypeService;
	
	public MenuUtil() {
		productTypeService=new ProductTypeServiceImpl();
	}

	public void start() {
		Scanner sc= new Scanner(System.in);
		String contiChoice;
		do {
			showMenu();
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the product type");
				ProductType productType = new ProductType();
				productType.setName(sc.next());
				productTypeService.addProductType(productType);
				System.out.println("Success ! Product Type Added Successfully");
				
				break;

			default:
				System.out.println("---------Wrong Choice------------");
				break;
			}
			
			System.out.println("Do you want to continue");
			contiChoice =  sc.next();
		} while(contiChoice.equalsIgnoreCase("yes"));
		
	}

	private void showMenu() {
		System.out.println("-----------Electronic Purchase Menu--------------");
		System.out.println("1. Create Product Type");
		
	}

}
