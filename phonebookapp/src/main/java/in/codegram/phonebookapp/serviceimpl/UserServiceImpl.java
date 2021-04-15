package in.codegram.phonebookapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.phonebookapp.dao.BaseDAO;
import in.codegram.phonebookapp.dao.UserDAO;
import in.codegram.phonebookapp.domain.User;
import in.codegram.phonebookapp.exception.BlockUserException;
import in.codegram.phonebookapp.service.UserService;

@Service
public class UserServiceImpl extends BaseDAO implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public void register(User user) {
		userDAO.save(user);
		
	}

	@Override
	public User authenticate(String loginName, String pwd) throws BlockUserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeLoginStatus(Integer userId, Integer loginStatus) {
		// TODO Auto-generated method stub
		
	}

}
