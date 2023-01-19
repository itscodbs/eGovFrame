package seong.hongyoon.ums;

import seong.hongyoon.ums.dao.UserDao;
import seong.hongyoon.ums.dao.UserDaoImpl;
import seong.hongyoon.ums.io.Console;
import seong.hongyoon.ums.io.Menu;
import seong.hongyoon.ums.io.MenuImpl;
import seong.hongyoon.ums.io.UserIo;
import seong.hongyoon.ums.io.UserIoImpl;
import seong.hongyoon.ums.sevice.UserService;
import seong.hongyoon.ums.sevice.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		String[] menuItem = {"목록", "등록", "수정","탈퇴"};
		
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo UserIo = new UserIoImpl(userService);
		Menu menu = new MenuImpl(menuItem, UserIo);
		
		Console.info("UMS를 시작합니다."); 
		menu.play();
		Console.info("UMS를 종료합니다.");
	}
}
