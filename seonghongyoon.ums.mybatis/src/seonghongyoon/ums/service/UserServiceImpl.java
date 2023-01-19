package seonghongyoon.ums.service;

import java.util.List;

import seonghongyoon.ums.dao.UserDao;
import seonghongyoon.ums.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> listUsers() {
		return userDao.getUsers();
	}
	
	@Override
	public User findUser(int userNo){
		return userDao.getUser(userNo);
	}
	
	@Override
	public boolean joinUser(String userName) {
		return userDao.insertUser(userName)>0;
	}
	
	@Override
	public boolean changeUser(User user) {
		return userDao.updateUser(user)>0;
	}
	
	@Override
	public boolean leaveUser(int userNo) {
		return userDao.deleteUser(userNo)>0;
	}
}
