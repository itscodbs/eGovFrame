package seong.hongyoon.ums.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import seong.hongyoon.ums.domain.User;

public class UserDaoImpl implements UserDao{
	private List<User> users;
	private int userNoSeq;
	
	public UserDaoImpl(){
		this.users = new ArrayList<User>();
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	public User getUser(int userNo){
		User user = null;
		for(User tmp:users)
			if(tmp.getUserNo()==userNo)       
				user = tmp;
		return user;
	}
	
	public boolean addUser(String userName){
		return users.add(new User(++userNoSeq, userName, LocalDate.now()));
	}
	
	public boolean updateUser(User user){
		int userNo = user.getUserNo();  
		
		boolean isModified = false;
		for(User tmp:users)
			if(tmp.getUserNo()==userNo){
				tmp.setUserName(user.getUserName());
				tmp.setRegDate(LocalDate.now());
				isModified = true;
			}
		return isModified;
	}
	
	public boolean delUser(int userNo){
		boolean isDel = false;
		
		for(int i=0; i<users.size(); i++){
			if(users.get(i).getUserNo()==userNo)
				isDel = users.remove(users.get(i));
		}
		return isDel;
	}
}
