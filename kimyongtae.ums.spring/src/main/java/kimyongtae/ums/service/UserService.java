package kimyongtae.ums.service;

import java.util.List;

import kimyongtae.ums.domain.User;

public interface UserService {
	List<User> listUsers();
	User findUser(int userNo);
	boolean join(String userName);
	boolean fixUserInfo(User user);
	boolean secede(int userNo);
}
