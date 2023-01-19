package seonghongyoon.ums.dao.mapper;

import java.util.List;

import seonghongyoon.ums.domain.User;

public interface UserMapper {
	List<User> getUsers();
	User getUser(int userNo);
	int insertUser(String userName);
	int updateUser(User user);
	int deleteUser(int userNo);
}
