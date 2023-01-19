package seong.hongyoon.ums.sevice;

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

	public User findUser(int userNo){
		return userDao.getUser(userNo);
	}

	public boolean join(String userName){
		return userDao.addUser(userName);
	}
	
	public boolean correctUser(User user){
		return userDao.updateUser(user);
	}
	
	public boolean secede(int userNo){
		return userDao.delUser(userNo);
	}
}
