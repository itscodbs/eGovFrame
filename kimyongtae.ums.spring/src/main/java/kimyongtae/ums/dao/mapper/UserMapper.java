package kimyongtae.ums.dao.mapper;

import java.util.List;

import kimyongtae.ums.domain.User;

public interface UserMapper {
	List<User> getUsers();
	User getUser(int userNo);
	int addUser(String userName);
	int updateUser(User user);
	int delUser(int userNo);	
}
