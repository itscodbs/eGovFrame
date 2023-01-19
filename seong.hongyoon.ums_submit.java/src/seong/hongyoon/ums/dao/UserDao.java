package seong.hongyoon.ums.dao;

import java.util.List;
import seong.hongyoon.ums.domain.User;

public interface UserDao {
	List<User> getUsers();
	User getUser(int userNo);
	boolean addUser(String userName);
	boolean updateUser(User user);
	boolean delUser(int UserNum);
}
