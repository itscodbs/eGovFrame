package ch07.ex01.case10.home.dao;

import ch07.ex01.case10.home.domain.User;

public class UserDaoImpl implements UserDao{
	@Override
	public User getUser(){
		return new User("최한석");
	}
}
