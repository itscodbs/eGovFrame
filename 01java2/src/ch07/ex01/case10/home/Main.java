package ch07.ex01.case10.home;

import ch07.ex01.case10.home.dao.UserDao;
import ch07.ex01.case10.home.dao.UserDaoImpl;
import ch07.ex01.case10.home.io.UserIo;
import ch07.ex01.case10.home.service.UserService;
import ch07.ex01.case10.home.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.display();
	}
}
