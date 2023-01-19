package spring.core.ch02.ex01.user.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	public int getUserCnt(){
		return 3;
	}
	
	public String getUserName(){
		return "john";
	}
	
	public void setUserName(String userName){
		System.out.println(userName);
	}
}
