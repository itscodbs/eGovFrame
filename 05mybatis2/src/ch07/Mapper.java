package ch07;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Mapper {
	@Select("select user_id userId, user_name userName, reg_date regDate from users")
	List<User> getUsers();
	
	@Select("select user_id userId, user_name userName, reg_date regDate from users")
	User getUser(int userId);
	
	@Insert("insert into values(#{userId}, #{userName,jdbcType=VARCHAR, #{regDate}")
	int addUser(User user);
	
	@Update("update users set user_name=#{userName}, reg_date=#{regDate} where user_id=#{userId}")
	int updateUser(User user);
	
	@Delete("delete users where user_id=#{userId")
	int delUser(int userId);
}
