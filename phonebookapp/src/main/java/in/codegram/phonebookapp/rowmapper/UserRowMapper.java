package in.codegram.phonebookapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.codegram.phonebookapp.domain.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user= new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAddress(rs.getString("address"));
		user.setEmail(rs.getString("email"));
		user.setLoginName(rs.getString("loginName"));
		user.setPhone(rs.getString("phone"));
		user.setPwd(rs.getString("pwd"));
		user.setRole(rs.getInt("role"));
		user.setStatus(rs.getInt("status"));
		return user;
	}

	

}
