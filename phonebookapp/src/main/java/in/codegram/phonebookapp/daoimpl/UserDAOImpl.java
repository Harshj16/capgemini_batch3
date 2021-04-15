package in.codegram.phonebookapp.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import in.codegram.phonebookapp.dao.BaseDAO;
import in.codegram.phonebookapp.dao.UserDAO;
import in.codegram.phonebookapp.domain.User;
import in.codegram.phonebookapp.rowmapper.UserRowMapper;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void save(User user) {
		String sql = "insert into users(name,phone,email,address,loginName, pwd,role,status) "
				+ "values(:name,:phone,:email,:address,:loginName, :pwd,:role,:status)";
		
		Map<String, Object> params =  new HashMap<>();
		params.put("name", user.getName());
		params.put("phone", user.getPhone());
		params.put("email", user.getEmail());
		params.put("address", user.getAddress());
		params.put("loginName", user.getLoginName());
		params.put("pwd", user.getPwd());
		params.put("role", user.getRole());
		params.put("status", user.getStatus());
		
		KeyHolder kh=new GeneratedKeyHolder();
		SqlParameterSource ps=new MapSqlParameterSource(params);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
		Integer userId = kh.getKey().intValue();
		System.out.println(userId);
		

	}

	@Override
	public void update(User user) {
	   String sql = "update users set name = :name,phone=:phone, email=:email,address=:address, pwd=:pwd,role=:role, status=:status where id=:id";
	   Map<String, Object> params = new HashMap<>();
	   params.put("name", user.getName());
	   params.put("phone", user.getPhone());
	   params.put("email", user.getEmail());
	   params.put("address", user.getAddress());
	   params.put("pwd", user.getPwd());
	   params.put("role", user.getRole());
	   params.put("status", user.getStatus());
	   params.put("id", user.getId());
	   
	   getNamedParameterJdbcTemplate().update(sql, params);

	}

	@Override
	public void delete(User user) {
		delete(user.getId());
	}

	@Override
	public void delete(Integer userId) {
		String sql ="delete from users where id=?";
		getJdbcTemplate().update(sql,userId);
	}

	@Override
	public User findById(Integer userId) {
		String sql="select * from users where id=?";
		User user = getJdbcTemplate().queryForObject(sql, new UserRowMapper(),userId);
		return user;
	}

	@Override
	public List<User> findAll() {
		String sql="select * from users";
		List<User> users =  getJdbcTemplate().query(sql, new UserRowMapper());
		return users;
	}

	@Override
	public List<User> findByProperty(String propName, Object propValue) {
		String sql="select * from users where "+propName+" ="+propValue;
		List<User> users =  getJdbcTemplate().query(sql, new UserRowMapper());
		return users;
	}

}
