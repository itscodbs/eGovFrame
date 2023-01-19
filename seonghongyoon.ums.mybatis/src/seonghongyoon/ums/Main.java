package seonghongyoon.ums;

import seonghongyoon.ums.dao.UserDao;
import seonghongyoon.ums.dao.UserDaoImpl;
import seonghongyoon.ums.presentation.Console;
import seonghongyoon.ums.presentation.UserIo;
import seonghongyoon.ums.presentation.UserIoImpl;
import seonghongyoon.ums.service.UserService;
import seonghongyoon.ums.service.UserServiceImpl;


public class Main {
	public static void main(String[] args) {
		String[] menuItem = {"목록", "등록", "수정", "탈퇴"};
	
		UserDao userDao = new UserDaoImpl(); //userMapper 값이 셋팅 => mapping정보를 담고있음
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIoImpl(userService, menuItem);
		
		Console.info("UMS를 시작합니다.");
		userIo.play();
		Console.info("UMS를 종료합니다.");
	}
}