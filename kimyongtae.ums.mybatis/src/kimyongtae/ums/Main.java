package kimyongtae.ums;

import kimyongtae.ums.dao.UserDao;
import kimyongtae.ums.dao.UserDaoImpl;
import kimyongtae.ums.presentation.Console;
import kimyongtae.ums.presentation.UserIo;
import kimyongtae.ums.presentation.UserIoImpl;
import kimyongtae.ums.service.UserService;
import kimyongtae.ums.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		String[] menuItem = {"목록", "등록", "수정", "탈퇴"};
		
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIoImpl(userService, menuItem);
		
		Console.info("UMS를 시작합니다.");
		userIo.play();
		Console.info("UMS를 종료합니다.");
	}
}