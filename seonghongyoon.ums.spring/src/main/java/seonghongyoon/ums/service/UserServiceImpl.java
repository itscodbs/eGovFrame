package seonghongyoon.ums.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import seonghongyoon.ums.dao.UserDao;
import seonghongyoon.ums.domain.User;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired private UserDao userDao;
	 
	 public List<User> listUsers(){
		 return userDao.getUsers();
	 }
	
	 public User findUser(int userNo){
		 User user = null;
		 for(User tmp : userDao.getUsers()){
			 if(tmp.getUserNo() == userNo) { 
				 user = tmp;
				 break;
			 }
		 }
		 return user;
	 }
		
	 @Transactional
	 public boolean join(String userName){
		 return userDao.addUser(userName)>0;
	 }
	 
	 @Transactional
	 public boolean fixUserInfo(User user){
		 return userDao.updateUser(user)>0;
	 }
	 
	 @Transactional
	 public boolean secede(int userNo){
		 return userDao.delUser(userNo)>0;
	 }
}



