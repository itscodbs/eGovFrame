package ch07.ex01.case10.home.dao;

import ch07.ex01.case10.home.domain.User;

public interface UserDao { 
	public User getUser();
}// User와 service를 연결해주는 매개체역할. interface
