package seonghongyoon.ums.service;

import java.util.List;

import seonghongyoon.ums.domain.User;

public interface UserService {
	List<User> listUsers(); 
	User findUser(int userNo); 
	boolean joinUser(String userName);  
	boolean changeUser(User user); 
	boolean leaveUser(int userNo); 
}