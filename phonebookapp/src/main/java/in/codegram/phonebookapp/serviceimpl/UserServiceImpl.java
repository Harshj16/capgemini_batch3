package in.codegram.phonebookapp.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import in.codegram.phonebookapp.constants.PhoneBookConstants;
import in.codegram.phonebookapp.dao.BaseDAO;
import in.codegram.phonebookapp.dao.UserDAO;
import in.codegram.phonebookapp.domain.User;
import in.codegram.phonebookapp.exception.BlockUserException;
import in.codegram.phonebookapp.rowmapper.UserRowMapper;
import in.codegram.phonebookapp.service.UserService;

@Service
public class UserServiceImpl extends BaseDAO implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public void register(User user) {
		userDAO.save(user);

	}

	@Override
	public User authenticate(String loginName, String pwd) throws BlockUserException {
		String sql = "select * from users where loginName=:loginName AND pwd=:pwd";
		Map<String, Object> params = new HashMap<>();
		params.put("loginName", loginName);
		params.put("pwd", pwd);
		try {
			User user = getNamedParameterJdbcTemplate().queryForObject(sql, params, new UserRowMapper());
			if (user.getStatus().equals(PhoneBookConstants.USER_STATUS_BLOCKED)) {
				throw new BlockUserException("You are blocked! Contact your Administrator for more help");
			} else {
				return user;
			}
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
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
