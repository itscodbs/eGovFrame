package seonghongyoon.ums.service;

import java.util.List;

import seonghongyoon.ums.dao.UserDao;
import seonghongyoon.ums.dao.UserDaoImpl;
import seonghongyoon.ums.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl() {
		this.userDao = new UserDaoImpl();
	}
	
	// 사용자 정보 목록을 뽑아낸다
	// return : 사용자 정보 목록
	@Override
	public List<User> listUsers() {
		return userDao.getUsers();
	}
	
	// 사용자 한명을 조회한다.
	// return : 사용자
	// param : 사용자 번호	
	@Override
	public User findUser(int userNo) {
		return userDao.getUser(userNo);
	}
	
	// 사용자를 등록한다.
	// return : 등록 성공 여부
	// param : 사용자 이름
	@Override
	public boolean join(String userName) {
		return userDao.addUser(userName)>0;
	}
	
	// 사용자 정보를 수정한다.
	// return : 수정 성공 여부
	// param : 사용자 정보
	@Override
	public boolean correctUser(User user) {
		return userDao.updateUser(user)>0;
	}
	
	// 사용자를 탈퇴시킨다.
	// return : 탈퇴 성공 여부
	// param : 사용자 번호
	@Override
	public boolean secede(int userNo) {
		return userDao.delUser(userNo)>0;
	}
}