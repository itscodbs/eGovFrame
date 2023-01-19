package ch07.ex01.case10.ums;

import ch07.ex01.case10.ums.io.UserIo;
import ch07.ex01.case10.ums.service.UserService;
import ch07.ex01.case10.ums.service.UserServiceEng;
import ch07.ex01.case10.ums.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserService userService1 = new UserServiceImpl();
		UserService userService2 = new UserServiceEng();
		UserIo userIo = new UserIo();
		
		userIo.setUserService(userService1);
		userIo.display();
		userIo.setUserService(userService2);
		userIo.display();
	}
}
