package seong.hongyoon.ums.service;

import java.util.List;

import seong.hongyoon.ums.domain.User;

public interface UserService {
	List<User> listUsers();
	User findUser(int userNum);
	boolean join(String userName);
	boolean correctUser(User user);
	boolean secede(int userNum);
}
