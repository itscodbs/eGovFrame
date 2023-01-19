package ch07.ex01.case10.ums.io;

import ch07.ex01.case10.ums.service.UserService;

public class UserIo {
	private UserService userService;
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	
	public void display(){
		System.out.println(userService.getUser());
	}
}
