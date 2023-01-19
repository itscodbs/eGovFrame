package seong.hongyoon.ums.sevice;

import java.util.List;
import seong.hongyoon.ums.domain.User;

public interface UserService {
	List<User> listUsers();
	User findUser(int userNo);
	boolean join(String userName);
	boolean correctUser(User user);
	boolean secede(int userNo);	
}
