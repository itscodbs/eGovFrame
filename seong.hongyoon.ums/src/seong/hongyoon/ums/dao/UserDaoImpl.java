package seong.hongyoon.ums.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import seong.hongyoon.ums.domain.User;

public class UserDaoImpl implements UserDao{
	private List<User> users;
	private int userNumSeq;

	public UserDaoImpl(){
		this.users = new ArrayList<User>();
	}

	public List<User> getUsers(){
		return users;
	}

	public User getUser(int userNum){
		User user = null;
		for(User temp : users)
			if(temp.getUserNum()==userNum)
				user = temp;
		return user;
	}

	public boolean addUser(String userName){
		return users.add(new User(++userNumSeq, userName, LocalDate.now()));
	}

	public boolean updateUser(User user){
		int userNum = user.getUserNum();
		boolean isModified = false;

		for(User temp : users)
			if(temp.getUserNum()==userNum){
				temp.setUserName(user.getUserName());
				temp.setRegDate(LocalDate.now());
				isModified = true;
			}
		return isModified;
	}

	public boolean deleteUser(int userNum){
		boolean isDel = false;

		for(int i=0; i<users.size(); i++){
			if(users.get(i).getUserNum()==userNum)
				isDel = users.remove(users.get(i));
		}
		return isDel;
	}
}