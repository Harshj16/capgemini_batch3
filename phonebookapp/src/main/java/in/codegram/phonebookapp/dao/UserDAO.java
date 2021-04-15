package in.codegram.phonebookapp.dao;

import java.util.List;

import in.codegram.phonebookapp.domain.User;

public interface UserDAO {
	
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public void delete(Integer userId);
	public User findById(Integer userId);
	public List<User> findAll();
	public List<User> findByProperty(String propName,Object propValue);

}
