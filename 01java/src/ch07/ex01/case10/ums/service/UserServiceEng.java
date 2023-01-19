package ch07.ex01.case10.ums.service;

import ch07.ex01.case10.ums.domain.User;

public class UserServiceEng implements UserService{
	@Override
	public User getUser(){
		return new User("Choi Han Suk");
	}
}
