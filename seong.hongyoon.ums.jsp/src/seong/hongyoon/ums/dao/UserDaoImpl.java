package seong.hongyoon.ums.dao;

import java.util.List;

import seong.hongyoon.ums.dao.config.Configuration;
import seong.hongyoon.ums.dao.mapper.UserMapper;
import seong.hongyoon.ums.domain.User;

public class UserDaoImpl implements UserDao {
	private UserMapper userMapper;
	
	public UserDaoImpl() {
		this.userMapper = Configuration.getMapper(UserMapper.class);
	}
	
	public List<User> getUsers() {
		return userMapper.getUsers();
	}
	
	public User getUser(int userNo) {
		return userMapper.getUser(userNo);
	}
	
	public int addUser(String userName) {
		return userMapper.addUser(userName);
	}	

	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}
	
	public int delUser(int userNo) {
		return userMapper.delUser(userNo);
	}
}