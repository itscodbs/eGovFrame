package seonghongyoon.ums.service;

import java.util.List;

import seonghongyoon.ums.domain.User;

public interface UserService {
	List<User> listUsers();
	User findUser(int userNo);
	boolean join(String userName);
	boolean correctUser(User user);
	boolean secede(int userNo);
}
