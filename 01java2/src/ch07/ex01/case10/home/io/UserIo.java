 package ch07.ex01.case10.home.io;

import ch07.ex01.case10.home.service.UserService;

public class UserIo {
	private UserService userService;

	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void display(){
		System.out.println(userService.findUser());
	}
}
