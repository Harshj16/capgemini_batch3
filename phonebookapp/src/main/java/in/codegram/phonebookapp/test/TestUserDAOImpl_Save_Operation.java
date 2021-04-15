package in.codegram.phonebookapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.codegram.phonebookapp.configuration.SpringRootConfig;
import in.codegram.phonebookapp.dao.UserDAO;
import in.codegram.phonebookapp.domain.User;

public class TestUserDAOImpl_Save_Operation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		// user detail will be taken from some service layer
		
		User user = new User();
		user.setName("harsh");
		user.setEmail("harsh@gmail.com");
		user.setAddress("pune");
		user.setLoginName("harsh");
		user.setPwd("harsh123");
		user.setPhone("1234567898");
		user.setRole(1);
		user.setStatus(1);
		
		userDAO.save(user);
		
		System.out.println("--User Saved--");
		

	}

}
