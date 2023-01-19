package kimyongtae.ums.dao;

import java.util.List;

import kimyongtae.ums.dao.mapper.UserMapper;
import kimyongtae.ums.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired private UserMapper userMapper;
	
	public List<User> getUsers(){
		return userMapper.getUsers();
	}
	
	public User getUser(int userNo){
		return userMapper.getUser(userNo);
	}
	
	public int addUser(String userName){
		return userMapper.addUser(userName);
	}
	
	public int updateUser(User user){
		return userMapper.updateUser(user);
	}

	public int delUser(int userNo){
		return userMapper.delUser(userNo);
	}
}