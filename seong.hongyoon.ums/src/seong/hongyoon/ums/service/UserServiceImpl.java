package seong.hongyoon.ums.service;

import java.util.List;

import seong.hongyoon.ums.dao.UserDao;
import seong.hongyoon.ums.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao){
		this.userDao = userDao;
	}

	public List<User> listUsers(){
		return userDao.getUsers();
	}

	public User findUser(int userNum){
		return userDao.getUser(userNum);
	}

	public boolean join(String userName){
		return userDao.addUser(userName);
	}

	public boolean correctUser(User user){
		return userDao.updateUser(user);
	}

	public boolean secede(int userNum){
		return userDao.deleteUser(userNum);
	}
}