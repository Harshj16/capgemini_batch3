package com.cg.jpa_musicapp.dao;

import java.util.List;

import com.cg.jpa_musicapp.domain.UserDetail;

public interface UserDetailDAO {
	
	public UserDetail save(UserDetail user);

	public void update(UserDetail user);

	public void delete(UserDetail user);

	public void delete(Integer userId);

	public UserDetail findById(Integer userId);

	public List<UserDetail> findAll();

	public List<UserDetail> findByProperty(String propName, Object propValue);

}
