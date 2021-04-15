package in.codegram.phonebookapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.codegram.phonebookapp.configuration.SpringRootConfig;
import in.codegram.phonebookapp.dao.UserDAO;
import in.codegram.phonebookapp.domain.User;

public class TestUserDAOImpl_FindById_Operation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		// user detail will be taken from some service layer
		
		User user = userDAO.findById(1);
		System.out.println("Name : "+user.getName());
		

	}

}
