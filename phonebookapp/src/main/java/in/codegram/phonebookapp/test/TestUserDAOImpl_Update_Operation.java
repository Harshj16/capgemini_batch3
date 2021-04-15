package in.codegram.phonebookapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.codegram.phonebookapp.configuration.SpringRootConfig;
import in.codegram.phonebookapp.dao.UserDAO;
import in.codegram.phonebookapp.domain.User;

public class TestUserDAOImpl_Update_Operation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		// user detail will be taken from some service layer
		
		User user = new User();
		user.setId(2);
		user.setName("harsh joshi");
		user.setEmail("harsh@gmail.com");
		user.setAddress("delhi");
		user.setPwd("harsh123");
		user.setPhone("1234567898");
		user.setRole(1);
		user.setStatus(2);
		
		userDAO.update(user);
		
		System.out.println("--User updated--");
		

	}

}
