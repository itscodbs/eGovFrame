package seonghongyoon.ums.dao;

import java.util.List;

import seonghongyoon.ums.dao.config.Configuration;
import seonghongyoon.ums.dao.mapper.UserMapper;
import seonghongyoon.ums.domain.User;

public class UserDaoImpl implements UserDao{
	private UserMapper userMapper;
	
	public UserDaoImpl(){
		this.userMapper = Configuration.getMapper(UserMapper.class);
	}
	
	public List<User> getUsers(){ 
		return userMapper.getUsers();
	}
	
	public User getUser(int userNo){
		return userMapper.getUser(userNo);
	}
	
	public int insertUser(String userName){
		return userMapper.insertUser(userName);
	}
	
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}
	
	public int deleteUser(int userNo) {
		return userMapper.deleteUser(userNo);
	}
}