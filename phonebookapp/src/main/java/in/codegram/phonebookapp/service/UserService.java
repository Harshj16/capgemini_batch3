package in.codegram.phonebookapp.service;

import java.util.List;

import in.codegram.phonebookapp.domain.User;
import in.codegram.phonebookapp.exception.BlockUserException;

/**
 * This service will perform all the user related tasks. 
 * @author panka
 *
 */
public interface UserService {

	/**
	 * This method will register the user based on the user provided
	 * @param user to be registered
	 */
	public void register(User user);
	
	/**
	 * This method handles the login operation using given credentials.
	 * If user is successfully logged in, this will return user object, otherwise it will return null. When user account is blocked an exception will be thrown
	 * by this method.
	 * @param loginName of the user
	 * @param pwd of the user
	 * @return User object in case of successful login otherwise null.
	 * @throws BlockUserException will be thorwn in case user is blocked by admin
	 */
	public User authenticate(String loginName, String pwd) throws BlockUserException;
	/**
	 * Call this method to get the list of registered users
	 * @return
	 */
	public List<User> getUserList();
	
	/**
	 * This method changes the user login status for the details passed as argument
	 * @param userId of the user
	 * @param loginStatus of of the user to change
	 */
	public void changeLoginStatus(Integer userId, Integer loginStatus);
}
