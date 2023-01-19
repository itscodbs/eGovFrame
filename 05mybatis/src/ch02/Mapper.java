package ch02;

import java.util.List;

public interface Mapper {
	List<User> getUsers();
	User getUser(int userId);
	int addUser(User user);
	int updateUser(User user);
	int delUser(int userId);
}
